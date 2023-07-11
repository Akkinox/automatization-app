package pages;

public class BancoPage extends BasePage{

    public BancoPage(){
        super(driver);
    }

    public void navigateToBanco(){
        navigateToBanco("http://www.bcentral.cl/");
    }

    public void ejerciciosPrueba(){
        ejeciciosPrueba("h1", "p");
    }

}