package travelers.com.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;

public class DriverFactory {

    public static WebDriver driverInstance;

    public static WebDriver getDriver(DriverType driverType) throws NoSuchDriverExeption{
        if(driverInstance == null){
            getSpecyficDriver (driverType);
            driverInstance.manage().window().maximize();
        }
        return driverInstance;

    }

    private static void getSpecyficDriver (DriverType driverType) throws NoSuchDriverExeption {

        switch (driverType) {
            case IE:
                break;

            case CHROME:
                File driverExe = new File("src//main//resources//executables//drivers//chromedriver.exe");
                ChromeDriverService driverService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(driverExe)
                        .usingAnyFreePort().build();
                driverInstance = new ChromeDriver(driverService);

                break;

            case FIREFOX:
                File firefoxExe = new File("src//main//resources//executables//drivers//geckodriver.exe");
                GeckoDriverService firefoxDriverService = new GeckoDriverService.Builder() {
                }
                        .usingDriverExecutable(firefoxExe)
                        .usingAnyFreePort().build();
                FirefoxOptions options = new FirefoxOptions();
                driverInstance = new FirefoxDriver (firefoxDriverService, options);
           break;
            default:
                System.out.println("Brak draivera danego typu");
                throw new NoSuchDriverExeption();

        }
    }


}
