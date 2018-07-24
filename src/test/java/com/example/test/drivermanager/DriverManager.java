package com.example.test.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is the class which will be used to maintain driver instance
 *  Make sure driver instance are managed at one place
 */
public class DriverManager {

    private static WebDriver driver;

    private DriverManager(){
        System.out.println("Calling Constructor");
        System.setProperty("webdriver.chrome.driver","C:/testing/chromedriver.exe");
        driver  = new ChromeDriver();
    }

    public static  WebDriver getDriver() {
        if(driver == null){
            new DriverManager();
        }
        return driver;
    }
}
