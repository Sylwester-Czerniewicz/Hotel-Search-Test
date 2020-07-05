package travelers.com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest extends BaseSeleniumTest {

    @Test
    public void searchForSeleniumTest () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()= 'Selenium']")).click();
    }

    @Test
    public void searchForAllegroTest () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Allegro");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()= 'Allegro - atrakcyjne ceny i 100% bezpieczeństwa']")).click();
    }
}
