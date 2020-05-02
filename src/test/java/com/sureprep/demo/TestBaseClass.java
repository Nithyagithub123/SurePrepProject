package com.sureprep.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import sureprepPageClasses.SurePrepHomePage;

public class TestBaseClass {
     
	WebDriver driver;
	
	SurePrepHomePage homepage;
	
	@BeforeMethod
	public void testPreSetUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\nithya\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://corp.sureprep.com/");
        homepage=new SurePrepHomePage(driver);
	}
	@AfterMethod
	public void testTearDown()
	{
       // driver.close();
	}
	

}
