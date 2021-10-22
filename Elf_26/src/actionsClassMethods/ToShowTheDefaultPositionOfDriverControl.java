package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToShowTheDefaultPositionOfDriverControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		
		Actions actions = new Actions(driver);
		WebElement menModule = driver.findElement(By.linkText("MEN"));		
		actions.moveToElement(menModule).perform();	
		Thread.sleep(2000);
		WebElement watchesLink = driver.findElement(By.linkText("Watches"));
		actions.moveToElement(watchesLink).click().perform();
	}

}
