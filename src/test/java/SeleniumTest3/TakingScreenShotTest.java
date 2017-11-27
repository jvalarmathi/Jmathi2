package SeleniumTest3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenShotTest {
@Test
	public void SSTest() throws IOException
	{
		
		File file = new File ("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		this.SSTest2(driver, "C://Users//IBM_ADMIN//Documents//Selenium//test.png") ; 
		
		
	}



public void SSTest2(WebDriver webdriver, String fileWithPath) throws IOException

{
	
	TakesScreenshot SS=((TakesScreenshot)webdriver);
	File srcfile=SS.getScreenshotAs(OutputType.FILE);
	File destfile = new File(fileWithPath);
	FileUtils.copyFile(srcfile, destfile);
	
}
	
}

