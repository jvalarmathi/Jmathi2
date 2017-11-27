package SeleniumTest3;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenlinksTest2 {
	
	@Test
	
	public void brokenlinktest()
	{
		File file = new File("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.zlti.com");
		driver.manage().window().maximize();
		HttpURLConnection huc = null;
		int responsecode = 200;
	List<WebElement> Alllinks= driver.findElements(By.tagName("a"));
	Iterator<WebElement> it=Alllinks.iterator();
	while (it.hasNext())
	{
		String pageurl=it.next().getAttribute("href");
		System.out.println(pageurl);
			if(pageurl==null || pageurl.isEmpty())
			{
				System.out.println("Url is empty");
				continue;
				}
			
			if(!pageurl.startsWith("http://www.zlti.com"))
			
			{
				System.out.println("Url is third party");
				continue;
			}
			
			try
			{
				huc=(HttpURLConnection)(new URL(pageurl).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				huc.getResponseCode();
				if(responsecode>=400)
				{
					System.out.println("Url is broken - "+pageurl);
				}
				
				else
				{
					System.out.println("Url is working - " + pageurl);
				}
				
				}
			catch (MalformedURLException e)
			{
				e.printStackTrace();
			}
				catch (IOException e)
			{
					e.printStackTrace();
			}
			}
			driver.close();
	}

}
