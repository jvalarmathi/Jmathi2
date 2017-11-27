package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import Flash.FlashObjectWebDriver;

public class FlashobjectTest {
@Test
public void FlshTest() throws InterruptedException
{
	File file = new File ("src/main/java/Drivers/geckodriver.exe");
	System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
	WebDriver driver= new FirefoxDriver();
	FlashObjectWebDriver flashapp = new FlashObjectWebDriver(driver, "myFlashMovie");
	driver.get("http://demo.guru99.com/flash-testing.html");
	flashapp.callFlashObject("Play");
	Thread.sleep(2000);
	flashapp.callFlashObject("Stop");
	Thread.sleep(2000);
	flashapp.callFlashObject("SetVariable","/:message","Flash testing using selenium Webdriver");
	System.out.println(flashapp.callFlashObject("GetVariable", "/:message"));
	
	
}
}
