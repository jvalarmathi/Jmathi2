package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class ScrolupandDown {
	@Test
	public void ScrollbarTest() throws InterruptedException
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
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		Thread.sleep(2000);
		driver.close();
	
	}

}
