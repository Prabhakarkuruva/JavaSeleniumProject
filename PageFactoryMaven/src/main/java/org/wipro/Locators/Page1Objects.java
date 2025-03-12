package org.wipro.Locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.wipro.Browser.Browser;

public class Page1Objects extends Browser {
    @FindBy(name="username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement login;
}