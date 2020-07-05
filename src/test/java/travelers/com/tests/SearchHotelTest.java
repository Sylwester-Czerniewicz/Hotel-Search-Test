package travelers.com.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import travelers.com.helpers.DriverFactory;
import travelers.com.helpers.ExcelHelpers;
import travelers.com.helpers.SeleniumHelper;
import travelers.com.helpers.TestListener;
import travelers.com.pages.HomePage;
import travelers.com.pages.ResultPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Listeners(TestListener.class)
public class SearchHotelTest extends BaseSeleniumTest {

    @Test //(dataProvider = "getData")

    public void searchHotelTest () throws InterruptedException, IOException {

        ExtentTest test = reports.createTest("Search Hotel Test");

        driver.get("http://www.kurs-selenium.pl/demo/");

        HomePage homePage = new HomePage(driver);
        //test.info("On PHP Travels Home Page", getScreenShot());

        homePage.setCityHotel("Dubai");
        homePage.setDateRange("18/04/2020", "22/04/2020");
        homePage.openTravellerModel();
        homePage.addChild();
        homePage.addChild();
        homePage.searchCity();

       // test.info("After performing search",getScreenShot());

        ResultPage resultPage = new ResultPage(driver);

       // test.info("Checking hotel names", getScreenShot());
        List<String> hotelNames = resultPage.getHotelsNames();
        Assert.assertEquals("Jumeirah Beach Hotel", hotelNames.get(0));
        Assert.assertEquals("Oasis Beach Tower", hotelNames.get(1));
        Assert.assertEquals("Rose Rayhaan Rotana", hotelNames.get(2));
        Assert.assertEquals("Hyatt Regency Perth", hotelNames.get(3));

       // test.info("Checking hotel prices", getScreenShot());
        List<String> prices = resultPage.getHotelPrices();
        Assert.assertEquals("$22",prices.get(0));
        Assert.assertEquals("$50", prices.get(1));
        Assert.assertEquals("$80", prices.get(2));
        Assert.assertEquals("$150", prices.get(3));


    }
    @DataProvider
    public Object [] [] getData () {
        Object [] [] data = null;
        try {
            data = ExcelHelpers.readExcelFile(new File("src//main//resources//Files//Dane.xlsx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
