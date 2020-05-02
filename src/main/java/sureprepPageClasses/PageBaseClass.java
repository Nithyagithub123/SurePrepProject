package sureprepPageClasses;

import org.openqa.selenium.WebDriver;

public class PageBaseClass {
	WebDriver driver;

	public PageBaseClass(WebDriver driver) 
	{
		
		this.driver=driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
