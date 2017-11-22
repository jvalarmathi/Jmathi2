package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {
	@Test
public void DraganddropTest()
{
	File file=new File ("src/main/java/Drivers/geckodriver.exe");
	System.setProperty("webdriver.gecko.driver",file.getAbsolutePath());
	WebDriver driver= new FirefoxDriver();
	driver.get("http://demo.guru99.com/selenium/drag_drop.html");
	WebElement From=driver.findElement(By.xpath(".//*[@id='credit2']/a"));
	WebElement to=driver.findElement(By.xpath(".//*[@id='bank']/li"));
	Actions act= new Actions(driver);
	act.dragAndDrop(From, to).build().perform();
	driver.close();
	}
}
