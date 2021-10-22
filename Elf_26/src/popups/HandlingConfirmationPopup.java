package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://licindia.in/Home/Policy-Loan-Options");
		driver.findElement(By.linkText("Pay Direct (Without login)")).click();
		
		Alert confAlert = driver.switchTo().alert();
		System.out.println(confAlert.getText());
		confAlert.dismiss();
	}

}
