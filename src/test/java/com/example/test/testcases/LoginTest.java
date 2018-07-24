package com.example.test.testcases;

import com.example.test.drivermanager.DriverManager;
import com.example.test.listners.ScreenShotListener;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenShotListener.class)
public class LoginTest {

    WebDriver driver ;
    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:/testing/chromedriver.exe");
         driver = DriverManager.getDriver();
         driver = DriverManager.getDriver();
        }

    @Test
    public void testCase1(){
        driver.get("https://www.thestar.com");
        Assert.fail();
    }

    @Test
    public void testCase2(){
        System.out.println("test Case 2");
    }

    @Test
    public void testCase3(){
        System.out.println("test Case 3");
    }



}
