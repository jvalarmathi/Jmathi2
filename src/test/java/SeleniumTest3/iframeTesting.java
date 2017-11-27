package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframeTesting {
	@Test
	
	public void iframe()
	{
	File file = new File("src/main/java/Drivers/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/selenium/guru99home/");
	driver.manage().window().maximize();
	
	int iframes=driver.findElements(By.tagName("iframe")).size();
	System.out.println("No.of.iframes:"+iframes);
			
			
	/*driver.switchTo().frame("a077aa5e");
	System.out.println("********We are switch to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img"));
	    //Clicks the iframe

		System.out.println("*********We are done***************");*/
}
}
