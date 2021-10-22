package webElementsIdentification;

import java.time.Month;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentVarun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("l","a","p","t","ops",Keys.ENTER);
		
		
		/*driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'HP Core i5 11th Gen')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Lenovo Thinkbook')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'acer Aspire')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'ASUS TUF Gaming')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'MSI GF63 Thin Core')]")).click();

		Set<String> allWindowIds = driver.getWindowHandles();
		for(String wid : allWindowIds) {
			driver.switchTo().window(wid);
			if(driver.getTitle().contains("acer Aspire")) {
				driver.close();
			}
		}*/
	}

}
