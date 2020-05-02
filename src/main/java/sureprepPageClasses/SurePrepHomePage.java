package sureprepPageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SurePrepHomePage extends PageBaseClass {

	public SurePrepHomePage(WebDriver driver) 
	{
		super(driver);
	}

	
	public TaxCaddyPage clickonSolutions() {
		driver.findElement(By.linkText("SOLUTIONS")).click();
		// Thread.sleep(3000);
		driver.findElement(By.linkText("TaxCaddy")).click();
		// Thread.sleep(3000);
		return new TaxCaddyPage(driver);
	}

	public TalktoSalesPage clickonTalktoSales() {
		// driver.findElement(By.id("tts-header")).click();
		driver.findElement(By.linkText("TALK TO SALES")).click();
		return new TalktoSalesPage(driver);
	}

}
