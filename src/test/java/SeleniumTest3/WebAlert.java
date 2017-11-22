package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumTest3.Objects.WebAlertPage;

public class WebAlert {
	@Test
	public void WebalertTest() throws Exception
	{
		
		File file = new File("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/delete_customer.php");
		driver.manage().window().maximize();
		
		WebAlertPage alert= new WebAlertPage(driver);
		alert.CusID();
		alert.Submit();
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		alert.CusID();
		alert.Submit();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
	}

}
