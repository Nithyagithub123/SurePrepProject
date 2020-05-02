package com.sureprep.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sureprepPageClasses.SurePrepHomePage;

public class SurePrepHomePageTest extends TestBaseClass {

	@Test
	public void verifyTitle() {
		String actual_title = homepage.clickonSolutions().getTitle();
		String expected_title = "Tax Document Organization Software | TaxCaddy";
		Assert.assertEquals(actual_title, expected_title, "Error");
	}

}
