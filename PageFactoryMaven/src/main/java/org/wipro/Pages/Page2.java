package org.wipro.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.wipro.Browser.Browser;
import org.wipro.Locators.Page2Objects;
public class Page2 extends Browser {
	static Page2Objects obj;
		public static String Username()
		{
	    	obj=PageFactory.initElements(driver, Page2Objects.class);

			wait.until(ExpectedConditions.elementToBeClickable(obj.dashboardelement));
			return obj.dashboardelement.getText();
		}
		public static void optionclick(String str) 
		{
			try{
				for(WebElement e:obj.list)
				{
					if(e.getText().equalsIgnoreCase(str))
					{	e.click();
						break; }
				}
				}
			
			catch(Exception E)
			{
				System.out.println("Click :"+E);
			}	
		}
		
		
}