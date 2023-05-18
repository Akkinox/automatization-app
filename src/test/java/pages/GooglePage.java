package pages;

public class GooglePage extends BasePage{

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateToGoogle("http://www.google.cl/");
    }

}