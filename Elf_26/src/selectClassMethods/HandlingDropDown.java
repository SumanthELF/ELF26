package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		
		
		selectLastOptionAlways(dayListBox);
		selectLastOptionAlways(monthListBox);
		selectLastOptionAlways(yearListBox);
		
		/*Select daySelect = new Select(dayListBox);
		Select monthSelect = new Select(monthListBox);
		Select yesarSelect = new Select(yearListBox);
		
		System.out.println(daySelect.isMultiple());
		daySelect.selectByIndex(26);
		monthSelect.selectByValue("9");
		yesarSelect.selectByVisibleText("2021");*/
	}
	
	/**
	 * This method is used to select the last option of given drop down
	 * @param ele pass the dropdown in the form of webelement
	 */
	public static void selectLastOptionAlways(WebElement ele) {
		Select select = new Select(ele);
		List<WebElement> allOptions = select.getOptions();
		select.selectByIndex(allOptions.size()-1);
	}

}
