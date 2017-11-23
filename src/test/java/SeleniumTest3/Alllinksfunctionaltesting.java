package SeleniumTest3;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alllinksfunctionaltesting {
	@Test
	public void alllinksTest(){
		int i=0;
		
		File file=new File("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/index.php");
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		int size= alllinks.size();
		System.out.println("Links:"+size);
		
		for (i=0; i<size; i++)
		{
		driver.findElement(By.id("i"));
		String title=driver.getTitle();
		if (title.equals("Under Construction: Mercury Tours"))
		{
			System.out.println("link is Under Construction");
		}
		else
		{
			System.out.println("Link is working");
		}
		
		}
	}
	
	

}
