package team1;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.congnixia.training.MavenTNGSelenium.common.ReadFromExcel;

public class Assesment3  extends TestNGBase{

	@Test (dataProvider = "getDataFromExcel")
	public void myTest(String searchstring, String expectedstring) {
		String searchstrings = searchstring;
		searchbox.sendKeys(searchstrings);
		searchbox.submit();
		Assert.assertEquals(driver.getTitle(), expectedstring);

	}
	
	@DataProvider
	public Object[][] getDataFromExcel() throws IOException {
		return ReadFromExcel.readExcelData("resources/Book1.xlsx");
	}
}