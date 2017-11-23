package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseandKeyboardActions {
	@Test
	
	public void MouseTest(){
		
		File file=new File("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/index.php");
		WebElement Home=driver.findElement(By.linkText("Home"));
		WebElement BGBox=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		Actions Homelink=new Actions(driver);
		Action mouseover=Homelink.moveToElement(Home).build();
		String BGColor=BGBox.getCssValue("background-color");
		  System.out.println("Before mouseover Background color: "+ BGColor);
		  mouseover.perform();
		  String BGColor1=BGBox.getCssValue("background-color");
      System.out.println("After mouseover Background color: "+ BGColor1);
   
	driver.close();
	}

}
