package SeleniumTest3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class ScrolupandDown {
	@Test
	public void ScrollbarTest() throws InterruptedException, IOException
	{
		//File file=new File("src/main/java/Drivers/IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		//WebDriver driver=new InternetExplorerDriver();
		File file = new File("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		this.takeSS(driver, "C://Users//IBM_ADMIN//Documents//Selenium//test1.png");
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		Thread.sleep(2000);
		this.takeSS(driver, "C://Users//IBM_ADMIN//Documents//Selenium//test2.png");
		driver.close();
	
	}
	
	public void takeSS(WebDriver webdriver, String fileWithPath) throws IOException
	{
		TakesScreenshot SS= ((TakesScreenshot)webdriver);
				File srcfile=SS.getScreenshotAs(OutputType.FILE);
		File Destfile= new File(fileWithPath);
		FileUtils.copyFile(srcfile, Destfile);
		
	}

}
