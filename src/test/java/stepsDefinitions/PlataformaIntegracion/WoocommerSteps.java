package stepsDefinitions.PlataformaIntegracion;
import framework.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.MiCorreo1_5.PageCheckOut;
import page.PlataformaIntegracion.Dashboard;
import page.PlataformaIntegracion.Woocommerce.Carrito;
import page.PlataformaIntegracion.Woocommerce.CheckOut;
import page.PlataformaIntegracion.Woocommerce.Home;

import static framework.BasePage.waitForSeconds;



public class WoocommerSteps {

    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.config.getProperty("urlWooCommerce");
    private Dashboard dashboard = new Dashboard(driver);
    private Home home = new Home(driver);
    private Carrito carrito = new Carrito(driver);
    private CheckOut checkout = new CheckOut(driver);
    private PageCheckOut pageCheckOut = new PageCheckOut(driver);

    private String pedidoImportado;

    @Given("^el usuario se situa en el ambiente de pruebas$")
    public void elUsuarioSeSituaEnElAmbienteDePruebas() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(baseUrl);
        System.out.println("el usuario se situa en el ambiente de pruebas");
    }
    @And("^visualiza los campos de usuario y contrasena$")
    public void visualizaLosCamposDeUsuarioYContrasena() {
        dashboard.verificarUsrAndPass();
        System.out.println("visualiza los campos de usuario y contrasena");
    }
    @Given("que el usuario habilitado inicia sesion en el dashboard")
    public void queElUsuarioHabilitadoIniciaSesionEnElDashboard() {
        waitForSeconds(2);
        dashboard.login();
        System.out.println("Inicio de sesion exitoso");
        dashboard.validarSubMenu();
    }
    @When("ingresa al ecommerce")
    public void ingresaAlEcommerce() {
        dashboard.ingresarEcommerce();
    }
    @And("anade articulos al carrito")
    public void anadeArticulosAlCarrito() {
        home.agregarAlCarrito();
        home.irAlCarrito();
    }
    @When("realiza el proceso de checkout obteniendo los numeros de pedido y monto de cotizacion")
    public void realizaElProcesoDeCheckoutObteniendoLosNumerosDePedidoYMontoDeCotizacion() {
        carrito.verCarrito();
        checkout.checkTienda();
        checkout.finalizarPedido();
    }
    @And("se visualizan los numeros de pedido en el dashboard y se importa el mismo")
    public void seVisualizanLosNumerosDePedidoEnElDashboardYSeImportaElMismo() {
        pedidoImportado = dashboard.importarPedido();
        System.out.println("Importación Exitosa! Pedido: " + pedidoImportado);
    }

    @Then("los numeros de pedido se visualizan dentro de la plataforma MiCorreo")
    public void losNumerosDePedidoSeVisualizanDentroDeLaPlataformaMiCorreo() {
        pageCheckOut.visualizarGrillaMiCorreo();
    }
    @Then("los datos en MiCorreo coinciden con los del ecommerce")
    public void losDatosEnMiCorreoCoincideConLosDelEcommerce() {
        pageCheckOut.obtenerContenidoTabla(By.xpath("//table[@class='table table-hover mcr-table table-responsive']"),pedidoImportado);
    }
}
