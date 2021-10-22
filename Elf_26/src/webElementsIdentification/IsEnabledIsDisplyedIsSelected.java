package webElementsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDisplyedIsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		WebElement linkedInIcon = driver.findElement(By.xpath("//input[@type='Submit']"));
		String data = linkedInIcon.getCssValue("border-bottom-color");
		System.out.println(data);
	}

}
