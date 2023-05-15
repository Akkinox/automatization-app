package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FactoryPage extends BasePage {
    
    @FindBy (id="boton")
    WebElement boton;


    public FactoryPage (){
        super(driver);
        driver.get("www.google.com");
    }
}
