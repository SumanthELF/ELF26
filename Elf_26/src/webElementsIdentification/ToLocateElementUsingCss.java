package webElementsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementUsingCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='keepLoggedInCheckBox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[title='Do not select if this computer is shared']")).click();
	}
	

}
