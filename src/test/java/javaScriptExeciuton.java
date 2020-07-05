import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import travelers.com.tests.BaseSeleniumTest;

public class javaScriptExeciuton extends BaseSeleniumTest {
    @Test
    public void googleSearcnTest() {
        driver.get("https://www.w3schools.com/");
        Actions acttion = new Actions(driver);
        acttion.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();


    }
}
