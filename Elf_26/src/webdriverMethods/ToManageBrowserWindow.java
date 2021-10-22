package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageBrowserWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Window window = driver.manage().window();
		
//		Dimension dimension = window.getSize();
//		System.out.println(dimension.height);
//		System.out.println(dimension.width);
//		
//		Point point = window.getPosition();
//		System.out.println(point.getX());
//		System.out.println(point.getY());
		Dimension newdim = new Dimension(500, 300);
		window.setSize(newdim);
		window.setPosition(new Point(0, 0));
	}

}
