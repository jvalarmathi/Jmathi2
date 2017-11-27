package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TooltipsTest {
	@Test (priority=1)
	public void toolTipsTest() {
		
		File file = new File ("src/main/java/Drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/webform/social-icon.html");
		WebElement Github = driver.findElement(By.xpath(".//*[@id='top-bar']/div/div/div[2]/div/a[4]"));
		String Actualtooltips=Github.getAttribute("title");
		Assert.assertEquals("Github", Actualtooltips);
		if ( Actualtooltips.equals("Github"))
		{
			System.out.println("Tooltip is correct");
			driver.close();
		}
		
		else
		
		{
			System.out.println("Tooltip is not correct");
			driver.close();
		}
	
	}

	@Test(priority=2)
	
	public void advancedtootipTest()
	{
		File file = new File ("src/main/java/Drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/webform/tooltip.html");
		WebElement dowbload=driver.findElement(By.xpath(".//*[@id='download_now']"));
		Actions act= new Actions(driver);
		act.clickAndHold().moveToElement(dowbload).build().perform();
		String whatisnewwlinktips=driver.findElement(By.xpath(".//*[@id='demo_content']/div/div/div/a")).getText();
		String Expectedtooltip = "What's new in 3.2";
		System.out.println("Whatsnewtooltips is " + whatisnewwlinktips );
		Assert.assertEquals(Expectedtooltip, whatisnewwlinktips);
		driver.close();
		
	}
}
