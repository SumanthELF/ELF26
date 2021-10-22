package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.naukri.com");
		System.out.println(driver.getTitle());
		
		String pageSorce = driver.getPageSource();
		System.out.println(pageSorce);
	}

}
