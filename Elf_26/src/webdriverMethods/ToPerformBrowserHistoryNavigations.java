package webdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigations {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		Navigation navigate = driver.navigate();
		URL url = new URL("https://www.youtube.com");
		navigate.to(url);
		
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		navigate.refresh();		
		
	}

}
