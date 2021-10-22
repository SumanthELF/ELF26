package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.marimallappawomenscollege.org/contactus.php");
		
		driver.findElement(By.name("Send")).click();
		driver.findElement(By.name("name")).sendKeys("Sumanth");
		
		Alert aleretPopup = driver.switchTo().alert();
		String alertMessage = aleretPopup.getText();
		System.out.println(alertMessage);
		aleretPopup.accept();
		
	}

}
