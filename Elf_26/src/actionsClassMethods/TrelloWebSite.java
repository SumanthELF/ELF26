package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloWebSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions actions = new Actions(driver);
		
		driver.get("https://trello.com/en/login");
		driver.findElement(By.id("user")).sendKeys("sumanthqsp@gmail.com");
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("password"))));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys(args[0]);
		driver.findElement(By.id("login-submit")).click();

		driver.findElement(By.xpath("//div[@title='ELF111213']")).click();
		WebElement student1Card = driver.findElement(By.xpath("//span[text()='Student1']"));
		
		actions.clickAndHold(driver.findElement(By.xpath("//span[text()='Student1']"))).perform();
		actions.moveByOffset(600,100).perform();
		Thread.sleep(3000);
		actions.release().perform();
	}

}
