package stepsDefinitions.PlataformaIntegracion;

import framework.DriverManager;
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


public class WooCrearUsuarioSteps {
    private WebDriver driver = DriverManager.getDriver();

    private String baseUrl = DriverManager.config.getProperty("url");
    private Dashboard dashboard = new Dashboard(driver);


    @Given("selecciono el menu Usuarios")
    public void seleccionoElMenuUsuarios() {
        dashboard.selecionarMenuUsarios();
    }
    @Given("hago clic en el boton Crear Usuario")
    public void hagoClicEnElBotonCrearUsuario() {
        dashboard.crearUsuario();
    }
    @Given("lleno el formulario con la informacion requerida")
    public void llenoElFormularioConLaInformacionRequerida() {
        dashboard.llenarFormularioCreacionUsuario();
    }
    @Given("selecciono el perfil deseado")
    public void seleccionoElPerfilDeseado() {
        dashboard.seleccionarPerfilGestorDeLaTienda();
    }
    @Given("Hacer un clic en el boton anadir nuevo usuario")
    public void hacerUnClicEnElBotonAnadirNuevoUsuario() {
        dashboard.hacarClicEnAnadirNuevoUsuario();
    }
    @When("Validar que el usuario se ha creado")
    public void validarQueElUsuarioSeHaCreado() {
        dashboard.validarUsuarioCreado();
    }

    //Perfiles

    @Given("selecciono el perfil Administrador")
    public void seleccionoElPerfilAdministrador() {
        dashboard.seleccionarPerfilAdministrador();
    }

    @Given("selecciono el perfil Gestor De La Tienda")
    public void seleccionoElPerfilGestorDeLaTienda() {
        dashboard.seleccionarPerfilGestorDeLaTienda();
    }
    @When("selecciono el perfil Cliente")
    public void seleccionoElPerfilCliente() {
        dashboard.seleccionarPerfilCliente();
    }
    @When("selecciono el perfil Suscritor")
    public void seleccionoElPerfilSuscritor() {
        dashboard.seleccionarPerfilSuscritor();
    }
    @When("selecciono el perfil Colaborador")
    public void seleccionoElPerfilColaborador() {
        dashboard.seleccionarPerfilColaborador();
    }
    @When("selecciono el perfil Autor")
    public void seleccionoElPerfilAutor() {
        dashboard.seleccionarPerfilAutor();
    }
    @When("selecciono el perfil Editor")
    public void seleccionoElPerfilEditor() {
        dashboard.seleccionarPerfilEditor();
    }
}
