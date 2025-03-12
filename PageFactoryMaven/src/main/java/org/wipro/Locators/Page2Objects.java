package org.wipro.Locators;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.wipro.Browser.Browser;
public class Page2Objects extends Browser {
		@FindAll(@FindBy(css="[class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]"))
		public List<WebElement> list;
	@FindBy(css="[class=\"oxd-userdropdown-name\"]")
	@CacheLookup
	public WebElement dashboardelement;
	
	}