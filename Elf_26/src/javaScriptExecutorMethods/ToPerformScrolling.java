package javaScriptExecutorMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		
		allWindowIds.remove(parentWindowId);
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			driver.close();
		}		
		driver.switchTo().window(parentWindowId);
		
		WebElement ceoJobsElement = driver.findElement(By.partialLinkText("CEO Jobs"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500);");
//		Thread.sleep(1000);
		/*String title = (String) */js.executeScript("history.go(0);");
//		System.out.println(title);
	}

}
