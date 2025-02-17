package stepsDefinitions.PlataformaIntegracion.Magento;

import framework.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import page.PlataformaIntegracion.Magento.DashboardMagento;
import page.PlataformaIntegracion.Magento.TiendaMagento;


public class MagentoSteps {
    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.config.getProperty("urlMagento");
    private DashboardMagento dashboardMagento = new DashboardMagento(driver);
    private TiendaMagento tiendaMagento = new TiendaMagento(driver);


    @Given("Inicio sesion en el panel de administracion de Magento")
    public void inicio_sesion_en_el_panel_de_administracion_de_magento() {
        driver.get(baseUrl);
        System.out.println("el usuario se situa en el ambiente de pruebas");
        dashboardMagento.loginDashboard();
    }
    @Given("el usuario navega hasta la pagina de la tienda")
    public void el_usuario_navega_hasta_la_pagina_de_la_tienda() {
        dashboardMagento.irALaTienda();
    }
    @Given("el usuario realiza un pedido segun el Paquete")
    public void el_usuario_realiza_un_pedido_segun_el_paquete() {
        //tiendaMagento.realizarPedido();
    }

    @Given("el usuario realiza un pedido segun el {string} y el {string}")
    public void el_usuario_realiza_un_pedido_segun_el_paquete_y_el_tipo_envio(String paquete, String tipoDeEnvio) {
        tiendaMagento.realizarPedido(paquete);
        String orderNumber = tiendaMagento.metodoEnvio(tipoDeEnvio);
    }

}
