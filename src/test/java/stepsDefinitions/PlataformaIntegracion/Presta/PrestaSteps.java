package stepsDefinitions.PlataformaIntegracion.Presta;

import framework.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.MiCorreo1_5.PageCheckOut;
import page.PlataformaIntegracion.Dashboard;
import page.PlataformaIntegracion.Presta.CarritoPresta;
import page.PlataformaIntegracion.Presta.CheckOutPresta;
import page.PlataformaIntegracion.Presta.DashboardPresta;
import page.PlataformaIntegracion.Presta.HomePresta;


import static framework.BasePage.waitForSeconds;


public class PrestaSteps {
    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.config.getProperty("urlPresta");
    private DashboardPresta dashboardPresta = new DashboardPresta(driver);
    private HomePresta homePresta = new HomePresta(driver);
    private CarritoPresta carritoPresta = new CarritoPresta(driver);
    private CheckOutPresta CheckOutPresta = new CheckOutPresta(driver);


    @Given("Inicio sesion en PrestaShop")
    public void inicio_sesion_en_presta_shop() {
        driver.get(baseUrl);
        System.out.println("el usuario se situa en el ambiente de pruebas");


        dashboardPresta.login();
/*
        //Login/ cambio de cuenta

        dashboardPresta.menuModulos();
        //dashboardPresta.activarDesactivarplugin();
        dashboardPresta.desintalarEInstalarPlugin();
        dashboardPresta.hacerClicEnConfigurar();
        dashboardPresta.opcionAPIMiCorreo();
        dashboardPresta.llenarFormularioTienda();
        dashboardPresta.validarLoginPaqAr();

*/

        homePresta.ingresarALaTienda();
        //homePresta.loginTienda();
        homePresta.seleccionDeProducto();
        carritoPresta.finalizarcompraCarrito();
        CheckOutPresta.usuarioInvitadoDatosPersonales();
        CheckOutPresta.usuarioInvitadoDirecciones();
        CheckOutPresta.seleccionDeEnvioOp1();
        CheckOutPresta.validacionDePedido();
        CheckOutPresta.informacionEnvio();


    }

    @Given("repetir {string}")
    public void repetir(String string) {
        System.out.println(string);
    }

}
