package webElementsIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheAttr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		String username = "Sumanth";
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("dafkjhakfhd");
//		WebElement usernameTextField = driver.findElement(By.id("email"));
//		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
//		
//		 Rectangle xLocOfUTF = usernameTextField.getRect();
//		int xLocOfPTF = passwordTextField.getLocation().getX();
//		xLocOfUTF.get
		
		
//		System.out.println(xLocOfUTF);
//		System.out.println(xLocOfPTF);
//		if(xLocOfUTF==xLocOfPTF) {
//			System.out.println("the right allignment is proper");
//		}
		/*usernameTextField.sendKeys(username);
		
		System.out.println(usernameTextField.getAttribute("class"));
		
		if(usernameTextField.getAttribute("value").equals(username)) {
			System.out.println("username is entered properly");
		}*/		
	}
}
