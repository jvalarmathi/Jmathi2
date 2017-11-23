package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Downloadfile {
	@Test
	public void DownloadTest()
	{
		
		File file=new File("src/main/java/Drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/yahoo.html");
		WebElement download=driver.findElement(By.xpath(".//*[@id='messenger-download']"));
		download.click();
		
	}

}
