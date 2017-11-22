package SeleniumTest3;

import java.io.File;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Dynamicwebtablecount {
	@Test
	
	public void ElementvisibleTest() throws ParseException
	{
		  String max;
	        double m=0,r=0;
		File file=new File("src/main/java/Drivers/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa");
		//Count No.of .Columns
		List<WebElement> columns = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No.of.Columns:" + columns.size());
		//Count no.of Rows
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("no.of.Rows:"+rows.size());
		
		//get 3rd row texts

		WebElement thirdrow=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[3]"));
		String rowtext=thirdrow.getText();
		System.out.println("3rd row text: "+ rowtext);
		
		//get 3rd row 3rd cell text
		
		WebElement cell=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[3]/td[3]"));
		String celltext=cell.getText();
		System.out.print("3rd row 3rd cell: "+ celltext);
		
		for (int i =1;i<rows.size();i++)
        {    
            max= driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
            NumberFormat f =NumberFormat.getNumberInstance(); 
            Number num = f.parse(max);
            max = num.toString();
            m = Double.parseDouble(max);
            if(m>r)
             {    
                r=m;
             }
        }
        System.out.println("Maximum current price is : "+ r);
		driver.close();
		
		
	}

}
