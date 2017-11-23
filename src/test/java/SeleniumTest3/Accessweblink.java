package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Accessweblink {
	@Test
	public void weblinkTest()
	{
		File file=new File("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/link.html");
		//LinkText
		driver.findElement(By.linkText("click here")).click();
		System.out.println("Page Title:"+driver.getTitle());
		//Partial Link Text
		driver.findElement(By.partialLinkText("mail")).click();
		System.out.println("Page Title:"+driver.getTitle());
		
		
	}
	
	

}
