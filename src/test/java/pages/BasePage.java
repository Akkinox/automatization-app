package pages;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    
    static {
        //System.setProperty("webdriver.chrome.driver", "/Users/ronal.olate/IdeaProjects/automatization-app/utilidades/Windows/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public static void navigateToGoogle(String url) {
        driver.get(url);
    }

    public static void navigateToBanco(String url) {
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    private  WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }   

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select  (Find(locator));

        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select  (Find(locator));

        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropdownByText(String locator, String valueToSelect){
        Select dropdown = new Select  (Find(locator));

        dropdown.selectByVisibleText(valueToSelect);
    }

    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));
    }

    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(Find(locator));
    }

    public String getValueFromTable(String locator, int row, int column){
        String cellINeed  =  locator+"/table/tbody/tr["+row+"]/td["+column+"]";

        return Find(cellINeed).getText();
    }
    // funciones para eliminar popups 
    public void switchToiFrame(int iFrameIndex){
        driver.switchTo().frame(iFrameIndex);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String textFromElement(String locator){
        return Find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }

    public boolean elementIsSelected(String locator){
        return Find(locator).isSelected();
    }

    public void ejeciciosPrueba(String locator, String locator2){
        // recuento y muestra de etiquetas <h1>
        List<WebElement> h1Tags = driver.findElements(By.tagName(locator));
        System.out.println("Cantidad de etiquetas h1 que existen en la pagina son: " + h1Tags.size());
        for (WebElement h1Tag : h1Tags) {
            System.out.println("texto: " + h1Tag.getText());
        }
        // Obtener todas las etiquetas de párrafo <p>
        List<WebElement> pTags = driver.findElements(By.tagName(locator2));
        System.out.println("Cantidad de etiquetas de párrafo: " + pTags.size());

        // Obtener el título del sitio
        String pageTitle = driver.getTitle();

        // Validar el título
        if (pageTitle.equals("Inicio - Banco Central de Chile")) {
            System.out.println("Título correcto!!");
        } else {
            System.out.println("Error en el título");
        }
    }

    


}
