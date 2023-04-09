package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest
{
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static String browser = "Firefox";
    static WebDriver driver;

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))
            driver = new ChromeDriver(); // set up the Chrome browser
        else if(browser.equalsIgnoreCase("Firefox"))
            driver = new FirefoxDriver(); // Set up the Firefox browser
        else if (browser.equalsIgnoreCase("Edge"))
            driver = new EdgeDriver(); // set up the Edge browser
        else
            System.out.println("Give browser in between Chrome,Firefox or Edge");
        driver.get(baseUrl);
        System.out.println("Page Title : " + driver.getTitle()); // Print the Page Tilte
        System.out.println("Current Url : " + driver.getCurrentUrl()); //Print the Current url
        System.out.println("Page Source : " + driver.getPageSource()); //Print the Page Source
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com"); // Enter the username into username field
        driver.findElement(By.id("user[password]")).sendKeys("Prime123"); // Enter the password into Password field
        driver.close(); // closing the browser
    }
}
