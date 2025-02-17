package stepsDefinitions.MiCorreo2;

import framework.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import page.MiCorreo2.MiCorreo2;
import page.PlataformaIntegracion.Magento.DashboardMagento;
import page.PlataformaIntegracion.Magento.TiendaMagento;


public class MiCorreo2Steps {
    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.config.getProperty("urlMiCorreo2");
    private MiCorreo2 miCorreo2 = new MiCorreo2(driver);


    @Given("el usuario {string} se situa en los campos email y password")
    public void elUsuarioSeSituaEnLosCamposEmailYPassword(String arg0) {
        driver.get(baseUrl);
        System.out.println("el usuario se situa en el ambiente de pruebas");
        miCorreo2.loginMiCorreo2();
    }

    @And("el usuario realiza un envio {string}")
    public void elUsuarioRealizaUnEnvio(String arg0) {
        miCorreo2.tipoDeEnvio();
    }

    @And("el usuario seleciona el tipo de {string}")
    public void elUsuarioSelecionaElTipoDe(String arg0) {
        miCorreo2.tipoDeEntrega();
    }

    @And("el usuario valida que se encuentre pagado el envio")
    public void elUsuarioValidaQueSeEncuentrePagadoElEnvio() {
        miCorreo2.validarPago();

    }

    @And("el usuario se dirige a las configuraciones de la cuenta")
    public void el_usuario_se_dirige_a_las_configuraciones_de_la_cuenta() {
        miCorreo2.configuracionCuenta();
    }

    @And("el usuario cambia los datos de la cuenta")
    public void elUsuarioCambiaLosDatosDeLaCuenta() {
        miCorreo2.cambioDeDatos();
    }

    @And("el usuario cambia la informacion de la cuenta")
    public void elUsuarioCambiaLaInformacionDeLaCuenta() {
        miCorreo2.cambioInfoCuenta();
    }

    @And("el usuario configura una Pick Up")
    public void elUsuarioConfiguraUnaPickUp() {
        miCorreo2.cambioDomiciliosPickUp();
        System.out.println("Campos faltantes");
    }
}
