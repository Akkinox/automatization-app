package steps;

import io.cucumber.java.en.*;
import pages.BancoPage;

public class BancoSteps {

    BancoPage banco = new BancoPage();

    @Given("^Busco la url del banco central en google$")
    public void navigateToBanco(){
        banco.navigateToBanco();
    }

    @When("^Encuentro la pagina del banco realizo un recuento de h1 en la pagina y contenido$")
    public void ejercicios(){
        banco.ejerciciosPrueba();
    }

}
