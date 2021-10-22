package webElementsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDownloadButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-16.0.2_linux-x64_bin.tar.gz")).click();
		
		boolean result = driver.findElement(By.linkText("Download jdk-16.0.2_linux-x64_bin.tar.gz")).isEnabled();
		System.out.println(result);
	}

}
