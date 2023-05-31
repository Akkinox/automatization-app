package steps;

import io.cucumber.java.en.*;
import pages.BancoPage;

public class BancoSteps {

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
