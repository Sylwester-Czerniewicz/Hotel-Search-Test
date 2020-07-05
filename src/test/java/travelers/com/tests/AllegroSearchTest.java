package travelers.com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AllegroSearchTest extends BaseSeleniumTest {

    @Test
    public void searchForFacebookTest () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Facebook");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()= 'Facebook – zaloguj się lub zarejestruj']")).click();
    }

    public void searchForAllegroTest () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Allegro");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()= 'Allegro - atrakcyjne ceny i 100% bezpieczeństwa']")).click();
    }
}
