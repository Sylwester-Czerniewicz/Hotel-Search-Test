import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import travelers.com.tests.BaseSeleniumTest;

import java.util.List;

public class AnnotationTest extends BaseSeleniumTest {


    @FindBy (xpath = "//input")
    private List<WebElement> inputs;

    @FindBy (xpath = "//button")
    private List <WebElement> buttons;

    @FindAll({
            @FindBy (xpath = "//input"),
            @FindBy (xpath = "//button")

    })
    private List <WebElement> inputsAndButtons;

    @Test
    public void googleSearcnTest()  {
        PageFactory.initElements(driver, this);
        driver.get("file:///C:/Users/PC/Desktop/kurs%20testowania/Test.html");
        //System.out.println("Inputs size is " + inputs.size());
        //System.out.println("Buttons size is " + buttons.size());
        System.out.println("Inputs and Buttons size is " + inputsAndButtons.size());






    }




}
   /*


             WebElement newPageButton = driver.findElement(By.id("newPage"));
                String currentWindowName = driver.getWindowHandle();
                newPageButton.click();
                switchToNewWindow(driver, currentWindowName);
                System.out.println("Tytuł to " + driver.getTitle());
                System.out.println( "Obecny URL to " + driver.getCurrentUrl());
                driver.close();
                driver.switchTo().window(currentWindowName);
                driver.findElement(By.name("username")).sendKeys("Mouse");
        private void switchToNewWindow(WebDriver driver, String currentWindowName) { // metoda przełączająca nas na nowe okno
        System.out.println("Wartość dla obecnego okna " + currentWindowName);
        Set<String> windows = driver.getWindowHandles(); // robi liste i pobiera wszystkie dostepne strony do otworzenia dla drivera
        System.out.println("Ilość okien przegladarki to " + windows.size());
        for(String window : windows) {
            if(!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }
        }

    }checkIfElementExist(By.tagName("a"), driver);
        checkIfElementExist(By.tagName("aaaaaa"), driver);

        //checkIfElementExist(driver, By.tagName("a"));
        //checkIfElementExist(driver, By.tagName("aaaa"));
    public boolean checkIfElementExist (By locator, WebDriver driver) {
        if(driver.findElements(locator).size()>0) {
            return true;  // WAŻNEEEE!!!! METODA POZWALAJĄCA SPRAWDZIĆ CZY ELEMENTY ISTENIJA NA STRONIE
        }
        return false;
    }

 public void checkIfElementExist (WebDriver driver, By locator){
        try {
            driver.findElement(locator);
            System.out.println("element istnieje na stronie");

        }catch (NoSuchElementException exc){
            System.out.println("element nie istnieje na stronie");
        }

     }
        /*
        WebElement topSecret = driver.findElement(By.className("topSecret"));
        if(topSecret.isDisplayed()){  // metoda sprawdzająca czy element na stronie jest ukryty dla uzywtkowanika
            System.out.println("ten element jest widoczny");
            System.out.println(topSecret.getText());
        } else {
            System.out.println("ten element nie jest widoczny");
            System.out.println(topSecret.getAttribute("textContent"));
        }




        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if(checkBox.isSelected()) { // sprawdzamy czy checkbox jest zaznaczony czy nie
            System.out.println("Checkbox jest zaznaczony");
            Thread.sleep(3000);
            checkBox.click();
            System.out.println("checkboz jest odznaczony");

        }



        WebElement firstNameInput = driver.findElement(By.name("fname"));
        if (firstNameInput.isEnabled()) { // czy element jest dostepny dla uzytkowanika, a w tym wypadku czy mozna wpisac cos w pole tekstowe
            System.out.println("Ten element jest dostępny");
            firstNameInput.sendKeys("Sylwesterek");
        } else {
            System.out.println("Tyn element NIE jest dostępny");
        }







        WebElement smileImage = driver.findElement(By.id("smileImage"));
        System.out.println(smileImage.getSize().getHeight());  sprawdzanie wielkosci obrazka na stronie
        System.out.println(smileImage.getSize().getWidth());



        WebElement paragraf = driver.findElement(By.className("topSecret"));
        System.out.println("to jest tekst " + paragraf.getText());
        System.out.println("to jest tekst " + paragraf.getAttribute("value")); // POBIERANIE TEKSTU!!
        System.out.println("to jest tekst " + paragraf.getAttribute("textContent")); // wyszukanie i wyprintowanie UKRYTEGO TEKSTU w tagu HTML



        WebElement checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        //Thread.sleep(5000); zatrzymuje akcje na 5 sekund
        checkBox.click();
        WebElement radioButton = driver.findElement(By.xpath("//input[@value = 'male']"));
        //Thread.sleep(5000);
        radioButton.click();




        //driver.quit();



        Select carSelect = new Select(driver.findElement(By.tagName("select")));
        carSelect.selectByVisibleText("Mercedes");
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Sylwesterek");
        System.out.println("wartość to" + firstNameInput.getText());
        System.out.println("wartość to " + firstNameInput.getAttribute("value")); // POBIERANIE TEKSTU!!!  a w tym przypadku z pola tekstowego
        WebElement poleTekstowe = driver.findElement(By.tagName("label"));
        System.out.println(poleTekstowe.getText());

        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Sylwesterek");
        firstNameInput.clear();
        firstNameInput.sendKeys("Kasia");
        WebElement firstNameInput = driver.findElement(By.name("fname"));
        WebElement w3WSchoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleWirld = driver.findElement(By.partialLinkText("Weird"));
        WebElement classTopSecret = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));
        WebElement firstLink = driver.findElement(By.tagName("a"));

        List<WebElement> links = driver.findElements(By.tagName("an"));
        if(links.size()>0) {
            System.out.println("Znaleziono linki");
        }
        else {
            System.out.println("Linków nie znaleziono");
        }


        */













       /* WebElement clickOnMeCssButton =  driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement clickOnMeButtonXpath = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeButtonXpath2 = driver.findElement(By.xpath("//button"));
        WebElement topSecretXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement linktText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        */



//driver.close(); // zakyma okno pierwotne i zostawia to ktore zostało kliknięte
//driver.quit(); //zamyka wszystkie okna
