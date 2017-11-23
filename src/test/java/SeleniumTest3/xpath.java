package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class xpath {
	@Test
public void xpathTest()
{
	File file= new File ("src/main/java/Drivers/IEDriverServer.exe");
	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	WebDriver driver = new InternetExplorerDriver();
	driver.get("http://demo.guru99.com/v1/");
	driver.manage().window().maximize();
	//OR condition. Find element
	//WebElement userid=driver.findElement(By.xpath(".//input[@type='text'OR @name='uid']"));
	WebElement userid=driver.findElement(By.xpath(".//input[@type='text']"));
	userid.sendKeys("Test");
	//AND condition. Find element
	//WebElement password=driver.findElement(By.xpath(".//*[@name='password' AND @type='password']"));
	WebElement password=driver.findElement(By.xpath(".//*[@name='password']"));
	password.sendKeys("Test");
	WebElement submit=driver.findElement(By.xpath(".//*[@name='btnLogin']"));
	submit.click();
	
	//Contains
	//WebElement here=driver.findElement(By.xpath(".//*[contains(href(),'guru99.com')]"));
	//here.click();
	//System.out.println(driver.getTitle());
	
}

}
