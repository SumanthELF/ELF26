package popups;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleUploadPopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		String parentWinodwId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWinodwId);
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			driver.close();
		}
		driver.switchTo().window(parentWinodwId);		
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		Runtime.getRuntime().exec("./autoItPrg/naukri.exe");
	}

}
