package loginScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Sumanth
 *
 */
public class SimpleLoginScript {

	public static void main(String[] args) {
		//Pre condition
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is launched successfully");
		driver.manage().window().maximize();
		System.out.println("browser window is maximized successfully");

		String url = "https://demo.actitime.com/login.do";
		String expectedLoginPageTitle = "actiTIME - Login";
		String expectedHomePageTitle = "actiTIME -  Enter Time-Track";
		String usernameData = "admin";
		String passwordData = "manager";

		//Step 1 : entering the url
		driver.get(url);
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login page is displayed successfully");
		}else {
			System.out.println("Login page is not displayed successfully");
		}

		//Step 2 : enetring username
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(usernameData);
		String actualUsernameDataEntered = usernameTextField.getAttribute("value");
		if(usernameData.equals(actualUsernameDataEntered)) {
			System.out.println("Username data is entered properly");
		}else {
			System.out.println("Username data is not entered properly");
		}

		//Step 3 : entering password
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(passwordData);
		String actualPasswordDataEntered = passwordTextField.getAttribute("value");
		if(passwordData.equals(actualPasswordDataEntered)) {
			System.out.println("Password data is entered properly");
		}else {
			System.out.println("Password data is not entered properly");
		}

		//Step 4 : Click on Login button
		driver.findElement(By.id("loginButton")).click();
		String actualHomePageTite = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTite)) {
			System.out.println("Home Page is displayed successfully");
		}else {
			System.out.println("Home Page is not displayed successfully");
		}

	}

}
