package SeleniumTest3.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class WebAlertPage {
	public WebAlertPage(WebDriver driver) throws Exception {
		//super(driver);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	@FindBy(name="cusid")
	WebElement Customerid;
	@FindBy(name="submit")
	WebElement Submit;
	
	public void CusID()
	{
		Customerid.click();
	}
	public void Submit()
	{
		Submit.click();
	}
}
