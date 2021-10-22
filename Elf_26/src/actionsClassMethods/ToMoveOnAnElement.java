package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveOnAnElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/user/login");
				
		Actions actions = new Actions(driver);
		actions.moveByOffset(380, 430).click().perform();
		
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys("manager");
		actions.moveToElement(passwordTextField, 142, 0).click().perform();
	}

}
