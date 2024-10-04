package stepsDefinitions.PlataformaIntegracion;

import framework.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.PlataformaIntegracion.Dashboard;


public class WooCrearCuentaDNISteps {
    private WebDriver driver = DriverManager.getDriver();

    private String baseUrl = DriverManager.config.getProperty("url");
    private Dashboard dashboard = new Dashboard(driver);

    @When("dar clic en el boton crea una cuenta")
    public void darClicEnElBotonCreaUnaCuenta() {
        dashboard.darClicEnCreaUnaCuenta();
    }
    @When("selecionar la lista")
    public void selecionarLaLista() {
        dashboard.seleccionarLista();
    }
    @When("seleccionar tipo DNI")
    public void seleccionarTipoDNI() {
        dashboard.seleccionarDNI();
    }
    @When("seleccionar tipo CUIT")
    public void seleccionarTipoCUIT() {
        dashboard.seleccionarCUIT();
    }
    @When("Lllenar el formulario de cuenta para el plugin")
    public void lllenarElFormularioDeCuentaParaElPlugin() {
        dashboard.llenarFormularioPlugin();
    }
    @Then("Valido que la cuenta en el plugin se alla creado")
    public void validoQueLaCuentaEnElPluginSeAllaCreado() {
        dashboard.validarCuentaPlugin();
    }

}
