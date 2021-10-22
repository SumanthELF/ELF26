package actionsClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/shop/offers");
		List<WebElement> navBarElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		for(WebElement ele : navBarElements) {
			ele.click();
		}
		actions.keyUp(Keys.ALT).perform();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
