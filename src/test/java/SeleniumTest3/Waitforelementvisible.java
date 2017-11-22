package SeleniumTest3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforelementvisible {
	public void waitfortest()
	{
		File file=new File("src/main/java/Drivers/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement birthdaylink=driver.findElement(By.xpath(".//*[@id='birthday-help']"));
		birthdaylink.click();
		WebElement popup = driver.findElement(By.xpath(".//*[@id='js_pn']/div/div/div/div[1]"));
		WebElement ok=driver.findElement(By.xpath("'.//*[@id='js_pn']/div/div/div/div[2]/a"));
		//WebDriverWait wait = new WebDriverWait(driver, 15); 
		//wait.until(ExpectedConditions.textToBePresentInElement(popup, "Providing your date of birth"));
		
		
		
	}

}
