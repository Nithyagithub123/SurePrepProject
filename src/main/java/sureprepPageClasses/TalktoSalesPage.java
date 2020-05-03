package sureprepPageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TalktoSalesPage extends PageBaseClass {
	
	
	public TalktoSalesPage(WebDriver driver)
	{
		super(driver);
	}
	
	public TalktoSalesPage submitForm()
		{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.name("firstname")).sendKeys("reena");
		driver.findElement(By.name("phone")).sendKeys("4566788899");
		driver.findElement(By.name("company")).sendKeys("ysd");
		Select dropdown=new Select(driver.findElement(By.xpath(".//span[@role='textbox']")));
		dropdown.selectByIndex(3);
		System.out.println("drop down");
		
		return new TalktoSalesPage(driver);
	}

}
