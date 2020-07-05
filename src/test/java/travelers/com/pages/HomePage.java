package travelers.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import travelers.com.helpers.SeleniumHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage {

    @FindBy(xpath = "//span[text() = 'Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id = 'select2-drop']//input")
    private WebElement searchCityInput;

    @FindBy (name = "checkin")
    private WebElement checkInInput;

    @FindBy (name = "checkout")
    private WebElement checkOutInput;

    @FindBy (id = "travellersInput")
    private WebElement travellersInput;

    @FindBy (id = "adultPlusBtn")
    private WebElement adultPlusButton;

    @FindBy (id = "childPlusBtn")
    private WebElement childPlusButton;

    @FindBy (xpath = "//button[text() = ' Search']")
    private WebElement searchButton;



    @FindBy (xpath = "//div[@class = 'select2-result-label']")
    private WebElement selectResult;

    private SeleniumHelper helper;
    public WebDriver driver;

    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.helper = new SeleniumHelper(driver);
        this.driver = driver;
    }

    public void setCityHotel(String cityName) throws InterruptedException {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        //By locationLabel = By.xpath("//div[@class = 'select2-result-label']");
        helper.waitForElementToBeDisplayed(selectResult);
        //Thread.sleep(5000);
        searchCityInput.sendKeys(Keys.ENTER);

    }
    public void setDateRange (String checkInDate, String checkOutDate) {
        checkInInput.sendKeys(checkInDate);
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
    }

    public void openTravellerModel() throws InterruptedException {
        travellersInput.click();
        helper.waitForElementToBeDisplayed(adultPlusButton);
    }

    public void addAdult () {
        adultPlusButton.click();
    }
    public void addChild () {
        childPlusButton.click();
    }

    public void searchCity() {
        searchButton.click();
    }


}
