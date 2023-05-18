package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BancoPage extends BasePage{

    public BancoPage(){
        super(driver);
    }

    public void navigateToBanco(){
        navigateToBanco("http://www.bcentral.cl/");
    }

    public void contadorH1(){
        contarEtiquetasH1();
    }

}