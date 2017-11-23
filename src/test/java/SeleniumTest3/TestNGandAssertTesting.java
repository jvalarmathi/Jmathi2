package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGandAssertTesting {
	
	public WebDriver driver;
	@BeforeTest()
	public void Launchbrowser()
	{
		File file = new File ("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
	}
		@Test(priority=2)
	public void HomeTitle()	{
			WebDriver driver= new ChromeDriver();
			driver.get("http://demo.guru99.com/selenium/newtours/");
			String Pgtitle=driver.getTitle();
		Assert.assertEquals(Pgtitle,"Welcome: Mercury Tours");
				}
		/*@BeforeMethod()
		public void GetPagetitle()
		{
		System.out.println(driver.getTitle());
		}
		
		@AfterMethod()
		public void BacktoHome()
		{
			WebDriver driver= new ChromeDriver();
			driver.findElement(By.linkText("Home")).click();
			
		}*/

	@Test(priority=1)
	public void Flights()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
		driver.findElement(By.linkText("Flights")).click();
		String Pgtitle1=driver.getTitle();
		Assert.assertEquals(Pgtitle1,"Find a Flight: Mercury Tours:");
	
	}
	
	@AfterTest()
	public void Closebrowser()
	{
		WebDriver driver= new ChromeDriver();
		driver.close();
	}
}