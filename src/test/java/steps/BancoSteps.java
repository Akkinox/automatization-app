package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.BancoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BancoSteps {
    private WebDriver driver;

    BancoPage google = new BancoPage();

    @Given("^Busco la url del banco central en google$")
    public void navigateToBanco(){
        google.navigateToBanco();
    }

    @When("^Encuentro la pagina del banco realizo un recuento de h1 en la pagina y contenido$")
    public void obtenerH1(){
        google.contadorH1();
    }

    @And("^Hago click en el boton de busqueda$")
    public void clickSearchButton(){

    }

    /*@Then("^Obtengo resultados$")
    public void validateResults(){
        Assert.assertEquals("Chile", google.firstResult());
    }
    */
}
