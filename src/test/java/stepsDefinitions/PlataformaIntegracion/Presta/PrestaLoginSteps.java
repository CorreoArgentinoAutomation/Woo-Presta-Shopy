package stepsDefinitions.PlataformaIntegracion.Presta;

import framework.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.PlataformaIntegracion.Presta.CarritoPresta;
import page.PlataformaIntegracion.Presta.CheckOutPresta;
import page.PlataformaIntegracion.Presta.DashboardPresta;
import page.PlataformaIntegracion.Presta.HomePresta;


public class PrestaLoginSteps {
    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.config.getProperty("urlPresta");
    private DashboardPresta dashboardPresta = new DashboardPresta(driver);
    private HomePresta homePresta = new HomePresta(driver);
    private CarritoPresta carritoPresta = new CarritoPresta(driver);
    private CheckOutPresta CheckOutPresta = new CheckOutPresta(driver);


    @Given("el usuario ha iniciado sesion en el dashboard de Presta")
    public void elUsuarioHaIniciadoSesionEnElDashboardDePresta() {
        driver.get(baseUrl);
        System.out.println("el usuario se situa en el ambiente de pruebas");
        dashboardPresta.login();
    }

    @When("el usuario navega al menu de los modulos")
    public void elUsuarioNavegaAlMenuDeLosModulos() {
        dashboardPresta.menuModulos();
    }
    @And("el usuario reinicia la configuracion del Plugin de Mi Correo")
    public void elUsuarioReiniciaLaConfiguracionDelPluginDeMiCorreo() {
        dashboardPresta.desintalarEInstalarPlugin();
    }
    @And("el usuario ingresa a la configuracion del plugin")
    public void elUsuarioIngresaALaConfiguracionDelPlugin() {
        dashboardPresta.hacerClicEnConfigurar();
    }

    @And("el usuario se loguea en Api Paq Ar")
    public void el_usuario_se_loguea_en_api_paq_ar() {
        dashboardPresta.opcionAPIPaqAr();
    }
    @And("el usuario llena el formulario de la tienda")
    public void el_usuario_llena_el_formulario_de_la_tienda() {
        dashboardPresta.llenarFormularioTienda();
    }
    @Then("el usuario deberia ver un mensaje de confirmacion de login")
    public void elUsuarioDeberiaVerUnMensajeDeConfirmacionDeLogin() {
        dashboardPresta.validarLoginPaqAr();
        System.out.println("el usuario debería ver un mensaje de confirmación de login");
    }

    //crear Paquete
    @Then("el usuario crea un nuevo paquete")
    public void el_usuario_crea_un_nuevo_paquete() {
        dashboardPresta.crearPaquerte();
    }

    @Then("el usuario deberia ver un mensaje con los campos requeridos")
    public void elUsuarioDeberiaVerUnMensajeConLosCamposRequeridos() {
        dashboardPresta.validarCamposRequeridos();
    }





    //login Mi Correo
    @When("el usuario se loguea en Api Mi Correo")
    public void el_usuario_se_loguea_en_api_mi_correo() {
        dashboardPresta.opcionAPIMiCorreo();
    }
    @When("el usuario se loguea en Api Mi Correo con los {string}")
    public void el_usuario_se_loguea_en_api_mi_correo_con_los(String tipoUsuario) {
        dashboardPresta.seleccionoUsuario(tipoUsuario);
    }

    //Crear usuario outline
    @When("el usuario crea una cuenta en Api Mi Correo con el {string}")
    public void el_usuario_crea_una_cuenta_en_api_mi_correo_con_el(String tipoUsuario) {
        dashboardPresta.llenarCamposObligatorios(tipoUsuario);
    }
    @When("el usuario ingresa al formulario de creacion de cuenta")
    public void el_usuario_ingresa_al_formulario_de_creacion_de_cuenta() {
        dashboardPresta.ingresarACrearCuenta();
    }

    @Then("el usuario deberia ver un mensaje de error de login")
    public void elUsuarioDeberiaVerUnMensajeDeErrorDeLogin() {
        dashboardPresta.validacionNegativa();
        System.out.println("el usuario debería ver un mensaje de error de login");
    }
}
