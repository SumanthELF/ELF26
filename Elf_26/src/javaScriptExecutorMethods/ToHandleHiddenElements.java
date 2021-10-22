package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.get("https://www.facebook.com/signup");
		driver.get("https://demo.actitime.com/login.do");
//		WebElement hiddenTextBox = driver.findElement(By.name("custom_gender"));
		WebElement hiddenLink = driver.findElement(By.xpath("//a[text()='reload the page']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='It is working';", hiddenTextBox);
		js.executeScript("return arguments[0].click", hiddenLink);
//		driver.findElement(By.xpath("//label[text()='Custom']/..//input")).click();
		
	}

}
