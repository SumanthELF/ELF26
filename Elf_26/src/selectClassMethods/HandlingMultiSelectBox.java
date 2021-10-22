package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Sumanth/Desktop/dropDown.html");
		WebElement singleSelectBox = driver.findElement(By.id("s1"));
		WebElement multiSelectBox = driver.findElement(By.id("m1"));
		
		Select ssListBox = new Select(singleSelectBox);
		Select msListBox = new Select(multiSelectBox);
	}

}
