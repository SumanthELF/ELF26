package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCalendarPopup {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://www.makemytrip.com/");
		Actions actions = new Actions(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='LOGIN/ SIGNUP EASILY WITH']")));
		actions.click().perform();		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		selectDate(driver, 25, 2021, "Dec");	
	}
	
	public static void selectDate(WebDriver driver,int date,int year,String month) {
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+" "+date+" "+year+"')]")).click();	
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}
