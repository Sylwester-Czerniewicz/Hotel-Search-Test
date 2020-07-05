import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import travelers.com.tests.BaseSeleniumTest;

public class WaitsTest extends BaseSeleniumTest {
    @Test
    public void waitTest ()  {

        driver.get("file:///C:/Users/PC/Desktop/kurs%20testowania/Waits2.html");
        driver.findElement(By.tagName("button")).click();
        waitForWebElement(By.tagName("p"));
        WebElement paragraph = driver.findElement(By.tagName("p"));
        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }

    private void waitForWebElement (By locator) {

       WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
