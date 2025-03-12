package org.wipro.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.wipro.Browser.Browser;
import org.wipro.Locators.Page1Objects;

import java.time.Duration;

public class Page1 extends Browser {
    static Page1Objects obj;
    private static void initElements() {
        if (driver != null) {
            obj = PageFactory.initElements(driver, Page1Objects.class);
        } else {
            System.out.println("WebDriver is not initialized.");
        }
    }
    public static String getTitle() {
        initElements();
        if (driver != null) {
            return driver.getTitle();
        } else {
            System.out.println("WebDriver is null while fetching title.");
            return null;
        }
    }

    public static void enterUsername(String str) {
        try {
            initElements();
            if (driver != null) {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
                obj.username.sendKeys(str);
            } else {
                System.out.println("WebDriver is null while entering username.");
            }
        } catch (Exception e) {
            System.out.println("Username: " + e.getMessage());
        }
    }

    public static void enterPassword(String str) {
        try {
            initElements();
            if (driver != null) {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
                obj.password.sendKeys(str);
            } else {
                System.out.println("WebDriver is null while entering password.");
            }
        } catch (Exception e) {
            System.out.println("Password: " + e.getMessage());
        }
    }
    public static void login() {
        try {
            initElements();
            if (driver != null) {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
                obj.login.click();
            } else {
                System.out.println("WebDriver is null while clicking login.");
            }
        } catch (Exception e) {
            System.out.println("Login: " + e.getMessage());
        }
    }
}























//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.wipro.Browser.Browser;
//import org.wipro.Locators.Page1Objects;
//
//import java.time.Duration;
//
//public class Page1 extends Browser {
//	static Page1Objects obj;
//    public static String getTitle() {
//    	obj=PageFactory.initElements(driver, Page1Objects.class);
//        return driver.getTitle();
//    }
//    public static void enterUsername(String str) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//            wait.until(ExpectedConditions.elementToBeClickable(obj.username)); 
//           
//            obj.username.sendKeys("Admin"); 
//        } catch (Exception e) {
//            System.out.println("Username: " + e.getMessage());
//        }
//    }
//    public static void enterPassword(String str) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//            wait.until(ExpectedConditions.elementToBeClickable(obj.password));
//            obj.password.sendKeys("admin123"); 
//        } catch (Exception e) {
//            System.out.println("Password: " + e.getMessage());
//        }
//    }
//    public static void login() {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//            wait.until(ExpectedConditions.elementToBeClickable(obj.login));  
//            obj.login.click();
//        } catch (Exception e) {
//            System.out.println("Login: " + e.getMessage());
//        }
//    }
//    
//    
//}
