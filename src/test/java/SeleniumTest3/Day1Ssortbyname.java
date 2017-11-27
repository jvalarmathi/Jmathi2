package SeleniumTest3;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day1Ssortbyname {
	@Test
	public void Day1Test() throws InterruptedException
	{
		File file =new File ("src/main/java/Drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",file.getAbsolutePath());
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//Step1
		driver.get("http://live.guru99.com/");
		//Step2
		String homepagetitle=driver.findElement(By.xpath(".//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div/h2")).getText();
		System.out.println(homepagetitle);
		if (homepagetitle.equals("THIS IS DEMO SITE FOR   "))
		{
			System.out.println("Test Step 2 is passed");
			
		}
		
		else
		{
			System.out.println("Test Step2 is Failed");
		}
		//Step3
		driver.findElement(By.xpath(".//*[@id='nav']/ol/li[1]/a")).click();
		//Step4
		Thread.sleep(2000);
		String MobilePagetitle = driver.findElement(By.xpath(".//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[1]/h1")).getText();
		
		if (MobilePagetitle.equals("MOBILE")) 
		{
		System.out.println("Test Step 3 is passed");
		}
		
		else
		{
			System.out.println("Test Step3 is Failed");
		}
		
		Thread.sleep(2000);
		WebElement Sortby=driver.findElement(By.xpath(".//*[contains(@title,'Sort By')]"));
		//Step5
		Select sortby = new Select(Sortby);
		sortby.selectByVisibleText("Name");
		Thread.sleep(2000);
		System.out.println("Test Step5 passed");
		List<WebElement> items= driver.findElements(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li"));
		Iterator<WebElement> it = items.iterator();
		while(it.hasNext())
		{
			WebElement products = it.next();
			System.out.println(products.getText());
			
		}
		
		driver.close();
	}
	
}
