package stepsDefinitions.PlataformaIntegracion.Shopify;
import framework.BasePage;
import framework.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.PlataformaIntegracion.Presta.HomePresta;
import page.PlataformaIntegracion.Shopify.*;


public class Shopify {

    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.config.getProperty("url");
    private DashboardShopify dashboardShopi = new DashboardShopify(driver);



    @Given("Inicio sesion en Shopify")
    public void inicio_sesion_en_shopify() {
        System.out.println("Ingreso a la web de pruebas");
        driver.get(baseUrl);
        dashboardShopi.login();

    }

    @And("Ingreso a la tienda de Shopify")
    public void Ingreso_a_la_tienda_de_Shopify() {
        System.out.println("segundo Steps");
        dashboardShopi.ingresarALaTienda();

    }


}
