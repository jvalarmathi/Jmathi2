package SeleniumTest3;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ImplicitAndExplicit {
	@Test ( priority=1)
	
	public void ImplicitTest()
	{
		
		File file = new File ("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ExpectedTitle="Demo Guru99 Page";
		String ActualTitle = driver.getTitle();
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	driver.close();

	}
	
	@Test(priority=2)
	public void ExplicitTest()
	{
		File file = new File ("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String etitle="Demo Guru99 Page";
		String atitle=driver.getTitle();
		if (atitle.contentEquals(etitle))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Heading is not correct");
		}
		
		WebElement Seleniumlink=driver.findElement(By.linkText("SELENIUM"));
	wait.until(ExpectedConditions.visibilityOf(Seleniumlink)).click();
	System.out.println(driver.getTitle());
	driver.close();
		
	}
	

}
