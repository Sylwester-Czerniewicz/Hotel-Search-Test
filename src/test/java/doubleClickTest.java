import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import travelers.com.tests.BaseSeleniumTest;

public class doubleClickTest extends BaseSeleniumTest {

    @Test
    public void doubleClickTest () {
        SeleniumHelper helper = new SeleniumHelper(driver);
        driver.get("file:///C:/Users/PC/Desktop/kurs%20testowania/DoubleClick.html");
        WebElement clickMeTwice = driver.findElement(By.id("bottom"));
        Actions action = new Actions(driver);
        action.moveToElement(clickMeTwice).doubleClick().build().perform();
        helper.takeScreenshot();
        Assert.assertTrue(driver.getWindowHandles().size()>1);
    }
}
