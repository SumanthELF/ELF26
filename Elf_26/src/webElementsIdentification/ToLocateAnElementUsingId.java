package webElementsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateAnElementUsingId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.linkText("English (UK)")).click();
		WebElement usernameTextField = driver.findElement(By.id("usernme"));
		usernameTextField.sendKeys("Sumanth");
		
		driver.findElement(By.name("pwd")).sendKeys("123765gfefas");
		
		driver.findElement(By.id("loginButton")).sendKeys("adksfjhkja");
	}

}
