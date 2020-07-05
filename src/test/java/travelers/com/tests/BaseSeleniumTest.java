package travelers.com.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import travelers.com.helpers.DriverFactory;
import travelers.com.helpers.DriverType;
import travelers.com.helpers.NoSuchDriverExeption;
import travelers.com.helpers.SeleniumHelper;

import java.io.IOException;

public abstract class BaseSeleniumTest {

    protected WebDriver driver;
    protected ExtentHtmlReporter reporter;
    protected ExtentReports reports;

   /* @BeforeTest
    public void setUpReporter () {
        reporter = new ExtentHtmlReporter("src//main//resources//reports//index.html");
        reports = new ExtentReports();
        reports.attachReporter(reporter);
    } */

    @BeforeTest
    public void setUp () throws NoSuchDriverExeption {
        System.out.println("Before test");
        driver = DriverFactory.getDriver(DriverType.CHROME);
    }


    @AfterTest
    public void tearDown() {
        System.out.println("After test");;
        //driver.quit();

    }
    /* @AfterTest
    public void tearDownReport () {
        reporter.flush();
        reports.flush();
    }

    protected MediaEntityModelProvider getScreenShot () throws IOException {
        return MediaEntityBuilder.createScreenCaptureFromPath(SeleniumHelper.takeScreenShot(driver)).build();
    }*/
}
