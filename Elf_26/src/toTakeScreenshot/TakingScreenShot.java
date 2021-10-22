package toTakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).findElement(By.className(""));
		
		
		
//		File tempFile = driver.findElement(By.linkText("Create New Account")).getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./errorshots/loginButton.jpeg");
//		
//		FileUtils.copyFile(tempFile, destFile);		
		
		
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);		
		File screenshot = new File("./errorshots/sc1.png");
		FileUtils.copyFile(tempScreenshot, screenshot);
		driver.quit();	*/
		
		
	}

}
