package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Uploadfile {
	@Test
	public void uploadfileTest()
	{
		File file=new File("src/main/java/Drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");
		WebElement Uploadfile=driver.findElement(By.xpath(".//*[@id='uploadfile_0']"));
		WebElement TC=driver.findElement(By.xpath(".//*[@id='terms']"));
		WebElement Submit=driver.findElement(By.xpath(".//*[@id='submitbutton']"));
		Uploadfile.sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\SeleniumTest.xlsx");
		TC.click();
		Submit.click();
		
	}

}
