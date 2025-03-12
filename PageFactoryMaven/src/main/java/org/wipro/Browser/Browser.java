package org.wipro.Browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Browser {
	public static WebDriver driver;
	public static WebElement element;
	public static WebDriverWait wait;
	public static Actions act;
	public static void openBrowser()  {
		try {
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Browser - openBrowser "+e);
		}
	}
	public static void navigateToUrl(String str) {
		try {
			String Url = Utility.properties("url");
			driver.get(str); 
			driver.manage().window().maximize();
			act = new Actions(driver);
			String title=driver.getTitle();
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(title));
		} catch (Exception e) {
			System.out.println("Browser - navigatetoUrl "+e);
		}
	}
	public static void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser "+e);
		}
	}
	

}