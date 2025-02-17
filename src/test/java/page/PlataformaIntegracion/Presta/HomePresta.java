package page.PlataformaIntegracion.Presta;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePresta extends BasePage {
    public HomePresta(WebDriver driver) {super(driver);}

    private By btnIniciarSesion = By.xpath("(//a[@title='Acceda a su cuenta de cliente'])[1]");
    private By campoEmail = By.xpath("//input[@id='field-email' and @class='form-control' and @name='email' and @type='email']");
    private By campoPassword = By.xpath("//input[@id='field-password' and @class='form-control js-child-focus js-visible-password']");
    private By btnIniciarSesionLogin = By.xpath("//button[@id='submit-login' and @class='btn btn-primary']");
    private By seleccionarElPrimerProducto = By.xpath("(//img[@alt='Hummingbird printed t-shirt'])[1]");
    private By btnAnadirAlCarrito = By.xpath("//button[@class='btn btn-primary add-to-cart' and @type='submit']");
    private By btnFinalizarCompra = By.xpath("(//a[@class='btn btn-primary'])[2]");

    //Abrir la tienda
    public void ingresarALaTienda(){
        String urlNuevoAmbiente = "https://prestashop.integracionesco.shop/ag/";//"https://integracionesco.shop/pra/";
        abrirNuevaPestanaYNavegarA(urlNuevoAmbiente);
    }
    public void loginTienda(){
        waitForSeconds(5);
        click(btnIniciarSesion);
        String email = "Automationpi@yopmail.com";
        String password = "123123RrfewqR";
        writeText(campoEmail, email);
        writeText(campoPassword, password);
        click(btnIniciarSesionLogin);
    }



    public void seleccionDeProducto(){
        scrollPageUpDown(0,1);
        waitForSeconds(1);
        click(seleccionarElPrimerProducto);
        click(btnAnadirAlCarrito);
        waitForSeconds(2);
        click(btnFinalizarCompra);
    }
}
