package page.PlataformaIntegracion.Presta;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoPresta extends BasePage {
    public CarritoPresta(WebDriver driver) {
        super(driver);
    }

    private By btnFinalizarCompra = By.xpath("//div[@class='text-sm-center']");
    //private By = By.xpath("");
    //private By = By.xpath("");
    //private By = By.xpath("");
    //private By = By.xpath("");


    public void finalizarcompraCarrito(){
        click(btnFinalizarCompra);
    }



}
