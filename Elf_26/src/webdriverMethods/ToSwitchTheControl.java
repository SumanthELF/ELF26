package webdriverMethods;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		Map<String,String> allTitle = new TreeMap<>();
		for(String wid : allWindowIds) {
			driver.switchTo().window(wid);
			allTitle.put(driver.getTitle(),wid);
		}
		
		Set<String> windowIds = allTitle.keySet();
		for(String wid:windowIds) {
			driver.switchTo().window(allTitle.get(wid));
			driver.close();
			Thread.sleep(1000);
		}
//		driver.quit();
	}

}
