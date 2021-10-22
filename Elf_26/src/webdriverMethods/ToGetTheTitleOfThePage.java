package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTitleOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.get("https://www.myntra.com"); 
		String title = driver.getTitle();
		System.out.println(title);
		
//		driver.get("https://www.myntra.com"); 
	}

}