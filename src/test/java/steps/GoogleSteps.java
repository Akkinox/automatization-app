package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    
    GooglePage google = new GooglePage();

    @Given("^navego en google$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When("^Busco algun criterio de busqueda$")
    public void enterSearchCriteria(){

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
