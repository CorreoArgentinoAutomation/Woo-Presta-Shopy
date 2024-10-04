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



public class WooLoginConfiguracion {

    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.config.getProperty("urlWooCommerce");
    private Dashboard dashboard = new Dashboard(driver);


    @Given("que estoy en el Dashboard de WordPress")
    public void queEstoyEnElDashboardDeWordPress() {
        driver.get(baseUrl);
        dashboard.ingresarAWordPres();
    }
    @Then("ver solo 2 opciones Correo Argentino y Conexion Api")
    public void verSolo2OpcionesCorreoArgentinoYConexionApi() {
        dashboard.validarSubMenuSinLogin();
    }
    @When("hago clic en el boton Conexion Api")
    public void hagoClicEnElBotonConexionApi() {
        dashboard.ingresarAConexionApi();
    }
    @When("hago clic en el menu desplegable de Servicio")
    public void hagoClicEnElMenuDesplegableDeServicio() {
        dashboard.seleccionarServicio();
    }
    @When("selecciono el servicio Mi Correo")
    public void seleccionoElServicioMiCorreo() {
        dashboard.seleccionoMiCorreo();
    }
    @When("hago clic en el menu desplegable Queres usar el cotizador de Correo Argentino")
    public void hagoClicEnElMenuDesplegableQueresUsarElCotizadorDeCorreoArgentino() {
        dashboard.seleccionarCotizador();
    }
    @When("selecciono la opcion Si")
    public void seleccionoLaOpcionSi() {
        dashboard.seleccionarOpcionCotizador();
    }
    @When("hago clic en el boton Guardar Cambios")
    public void hagoClicEnElBotonGuardarCambios() {
        dashboard.guardarCambios();
    }

    //Usuarios
    @When("ingreso el usuario y la contrasena con el {string}")
    public void ingreso_el_usuario_y_la_contrasena_con_el(String string) {
        dashboard.seleccionoUsuario(string);
    }
    @When("completo los datos del negocio en el formulario")
    public void completoLosDatosDelNegocioEnElFormulario() {
        dashboard.llenarFormularioDeNegocio();
    }
    @Then("valido que se guarden los a justes")
    public void validoQueSeGuardenLosAJustes() {
        dashboard.validarMensajeGuardado();
    }

    //pasos de PaqAr
    @Given("hago clic en el boton de plugin")
    public void hagoClicEnElBotonDePlugin() {
        dashboard.irAlMenuPlugin();
    }
    @Given("desactivo el plugin")
    public void desactivoElPlugin() {
        dashboard.desactivarPlugin();
    }
    @Given("Activo el plugin")
    public void activoElPlugin() {
        dashboard.activarPlugin();
    }
    @When("selecciono el servicio PaqAr")
    public void seleccionoElServicioPaqAr() {
        dashboard.seleccionoPaqAr();
    }
    @When("Ingresar el Acuerdo y Clave API")
    public void ingresarElAcuerdoYClaveAPI() {
        dashboard.ingresoDeAcuerdoYClaveAPI();
    }


}
