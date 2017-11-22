package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Elementvisible {
	@Test
	public void ElementVisible()
	{
	File file=new File ("src/main/java/Drivers/geckodriver.exe");
	System.setProperty("webdriver.gecko.driver",file.getAbsolutePath());
	WebDriver driver= new FirefoxDriver();
	driver.get("http://money.rediff.com/gainers/bsc/daily/groupa");
	WebElement table=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table"));
	if (table.isDisplayed())
	{
		System.out.println("Webtable is displaying");
	}
		
	else
	{
		System.out.println("Webtable is not displaying");
	}
	}

}
