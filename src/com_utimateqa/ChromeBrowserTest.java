package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest
{
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args)
    {
        driver = new ChromeDriver(); //Set up the Chrome browser
        driver.get(baseUrl); // open the Url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Give the implicit wait
        System.out.println("Print the Page Title : " + driver.getTitle()); // Print the Page title
        System.out.println("Current url : " + driver.getCurrentUrl()); //print the current URL
        System.out.println("Page Source : " + driver.getPageSource()); //Print the Page source
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com"); // enter the email id into email id field
        driver.findElement(By.id("user[password]")).sendKeys("Prime123"); // enter the password into password field
        driver.close(); //closing the browser



    }
}
