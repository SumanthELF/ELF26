package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledTextBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Sumanth';", disabledTextBox);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='';", disabledTextBox);
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-11.0.13_linux-x64_bin.tar.gz")).click();
		WebElement downloadButton = driver.findElement(By.linkText("Download jdk-11.0.13_linux-x64_bin.tar.gz"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",downloadButton);*/
	}

}
