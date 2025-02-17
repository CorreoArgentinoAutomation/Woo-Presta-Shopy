package page.PlataformaIntegracion.Magento;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardMagento extends BasePage {
    public DashboardMagento(WebDriver driver) {
        super(driver);
    }

    private By campoUsr = By.xpath("//input[@id='username']");
    private By campoPassword = By.xpath("//input[@id='login']");
    private By btnSignIn = By.xpath("//span[.='Sign in']");

    private By btnProfile = By.xpath("//span[@class='admin-user-account-text']");
    private By opcionCustomerView = By.xpath("//a[contains(.,'Customer View')]");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");


    //Abrir la tienda
    public void ingresarALaTienda() {
        String urlNuevoAmbiente = "https://prestashop.integracionesco.shop/ag/";//"https://integracionesco.shop/pra/";
        abrirNuevaPestanaYNavegarA(urlNuevoAmbiente);
    }

    public void loginDashboard() {
        String userName = "admin";
        String password = "Pomelo-03";
        writeText(campoUsr, userName);
        writeText(campoPassword, password);
        click(btnSignIn);
    }

    public void irALaTienda(){
        String urlNuevoAmbiente = "https://magento.integracionesco.shop/";
        abrirNuevaPestanaYNavegarA(urlNuevoAmbiente);
        /*
        waitForSeconds(1);
        click(btnProfile);
        waitForSeconds(1);
        click(opcionCustomerView);
         */

    }

}
