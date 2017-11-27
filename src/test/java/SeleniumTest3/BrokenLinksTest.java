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

public class BrokenLinksTest {
	@Test
	public void brokenTest()
	{
		
		File file = new File("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.zlti.com");
		driver.manage().window().maximize();
		String Homepage="http://www.zlti.com";
		HttpURLConnection huc = null;
        int respCode = 200;
		List <WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=links.iterator();
		
		while (it.hasNext())
		{
		String url = it.next().getAttribute("href");
		System.out.println(url);
		
		if (url==null || url.isEmpty())
		{
			System.out.println("Url is empty");
			continue;
			
		}
		
		if(!url.startsWith("http://www.zlti.com"))
		{
			System.out.println("Url is thrid party url");
			continue;
		}
		
		try
		{
			huc=(HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			respCode=huc.getResponseCode();
			if(respCode>=400)
			{
				System.out.println(url+"is broken link");
			}
			
			else				
			{
				 System.out.println(url+" is a valid link");
			}	}
				 catch (MalformedURLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
		 }
             
		catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
		driver.navigate().back();
		}
}
