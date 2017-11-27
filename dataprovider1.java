package SeleniumTest3;

import org.testng.annotations.DataProvider;

public class dataprovider1 {
	@DataProvider(name="SearchProvider")
	
    public static Object[][] getDataFromDataprovider(){
        return new Object[][] {
            { "Guru99", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" }
        }; 
}
}