package SeleniumTest3;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownselectitem {
	@Test
	public void DropdownTest()
	{
		File file= new File ("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByValue("INDIA");
	
	}
	

}
