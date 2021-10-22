package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
				
//		WebDriverWait wait = new Fluen
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
//		driver.findElement(By.name("username")).sendKeys("admin");
//		wait.until(ExpectedConditions.)
		
		Wait wait = new FluentWait<WebDriver>(driver).
				withTimeout(30, TimeUnit.SECONDS).
				pollingEvery(5, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		
		
		
	}

}
