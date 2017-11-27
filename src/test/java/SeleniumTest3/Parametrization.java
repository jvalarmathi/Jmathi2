package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	@Test
	@Parameters({"author","searchKey"})
	
	public void parametrizationTest(@Optional("Abc") String author,String searchKey) throws InterruptedException
	{
		File file = new File ("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		WebElement Searchbox=driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		Searchbox.sendKeys(searchKey);
		String Textentered=Searchbox.getAttribute("value");
		System.out.println("Wecome"+author+"Your search Key is"+searchKey);
		System.out.println("Thread will sleep now");
        Thread.sleep(3000);
			System.out.println("Value in search box is :"+Textentered);
			Assert.assertEquals(searchKey, Textentered);
		
	}

}
