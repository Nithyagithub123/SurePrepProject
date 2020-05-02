package com.sureprep.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sureprepPageClasses.SurePrepHomePage;

public class SurePrep_TalktoSales_PageTest extends TestBaseClass {

	@Test
	public void verifySucessful_Submission_Form()
	{
		
		homepage.clickonTalktoSales().submitForm();
		
	}
	
	

}
