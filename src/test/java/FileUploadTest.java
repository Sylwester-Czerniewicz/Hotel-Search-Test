import org.openqa.selenium.By;
import org.testng.annotations.Test;
import travelers.com.tests.BaseSeleniumTest;

import java.io.File;

public class FileUploadTest extends BaseSeleniumTest {

    @Test
    public void uploadTest () {
        driver.get("file:///C:/Users/PC/Desktop/kurs%20testowania/FileUpload.html");
        String pathToFile = new File("src/main/resources/test643000000.png").getAbsolutePath();
        driver.findElement(By.id("myFile")).sendKeys(pathToFile);

    }
}
