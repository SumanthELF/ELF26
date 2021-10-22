package webElementsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnumInSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin",Keys.CONTROL+"a");
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"x");
//		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.TAB);
	}

}
