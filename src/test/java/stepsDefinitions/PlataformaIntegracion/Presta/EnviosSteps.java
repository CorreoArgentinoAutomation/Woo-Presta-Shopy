package stepsDefinitions.PlataformaIntegracion.Presta;

import framework.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.MiCorreo1_5.PageHomeLogin;
import page.PlataformaIntegracion.Presta.CarritoPresta;
import page.PlataformaIntegracion.Presta.CheckOutPresta;
import page.PlataformaIntegracion.Presta.DashboardPresta;
import page.PlataformaIntegracion.Presta.HomePresta;
import page.MiCorreo1_5.*;


public class EnviosSteps {
    private WebDriver driver = DriverManager.getDriver();
    private String baseUrl = DriverManager.config.getProperty("urlPresta");
    private DashboardPresta dashboardPresta = new DashboardPresta(driver);
    private HomePresta homePresta = new HomePresta(driver);
    private CarritoPresta carritoPresta = new CarritoPresta(driver);
    private CheckOutPresta CheckOutPresta = new CheckOutPresta(driver);
    private PageHomeLogin pageHomeLogin = new PageHomeLogin(driver);
    private PageCheckOut pageCheckOut = new PageCheckOut(driver);
    private String referenciaPedido;
    private String numeroOrden;


    @And("que estoy en la pagina de inicio de la tienda")
    public void que_estoy_en_la_pagina_de_inicio_de_la_tienda() {
        homePresta.ingresarALaTienda();
    }
    @And("selecciono un producto")
    public void selecciono_un_producto() {
        homePresta.seleccionDeProducto();
    }
    @And("agrego el producto al carrito")
    public void agrego_el_producto_al_carrito() {
        carritoPresta.finalizarcompraCarrito();
    }
    @And("procedo a pagar el producto del carrito")
    public void procedo_a_pagar_el_producto_del_carrito() {
        CheckOutPresta.usuarioInvitadoDatosPersonales();
        CheckOutPresta.usuarioInvitadoDirecciones();
    }

    @And("procedo a pagar el producto del carrito con error en la direccion")
    public void procedo_a_pagar_el_producto_del_carrito_con_error_en_la_direccion() {
        CheckOutPresta.usuarioInvitadoDatosPersonales();
        CheckOutPresta.usuarioInvitadoDireccionesNegativo();
    }

    @And("continuo con el proceso de checkout seleccionando el tipo de envio1")
    public void continuo_con_el_proceso_de_checkout_seleccionando_el_tipo_de_envio1() {
        CheckOutPresta.seleccionDeEnvioOp("seleccionDeEnvioOp1");
        CheckOutPresta.validacionDePedido();
    }
    @And("continuo con el proceso de checkout seleccionando el tipo de envio2")
    public void continuo_con_el_proceso_de_checkout_seleccionando_el_tipo_de_envio2() {
        CheckOutPresta.seleccionDeEnvioOp("seleccionDeEnvioOp2");
        CheckOutPresta.validacionDePedido();
    }
    @And("continuo con el proceso de checkout seleccionando el tipo de envio3")
    public void continuo_con_el_proceso_de_checkout_seleccionando_el_tipo_de_envio3() {
        CheckOutPresta.seleccionDeEnvioOp("seleccionDeEnvioOp3");
        CheckOutPresta.validacionDePedido();
    }
    @And("continuo con el proceso de checkout seleccionando el tipo de envio4")
    public void continuo_con_el_proceso_de_checkout_seleccionando_el_tipo_de_envio4() {
        CheckOutPresta.seleccionDeEnvioOp("seleccionDeEnvioOp4");
        CheckOutPresta.validacionDePedido();
    }


    @And("capturo la referencia del pedido")
    public void capturo_la_referencia_del_pedido() {
        referenciaPedido = CheckOutPresta.informacionEnvio();
    }
    @And("importo el pedido en el dashboard de PrestaShop")
    public void importo_el_pedido_en_el_dashboard_de_presta_shop() {
        dashboardPresta.importarPedido(referenciaPedido);
        numeroOrden = dashboardPresta.importarPedido(referenciaPedido);
    }

    @And("cancelo el pedido en el dashboard de PrestaShop")
    public void cancelo_el_pedido_en_el_dashboard_de_presta_shop() {
        dashboardPresta.cancelarPedido(referenciaPedido);
    }

    @And("preimpongo el pedido en el dashboard de PrestaShop")
    public void preimpongo_el_pedido_en_el_dashboard_de_presta_shop() {
        dashboardPresta.PreImponerPedido(referenciaPedido);
    }
    @And("pago el pedido en PrestaShop con el {string}")
    public void pago_el_pedido_en_presta_shop_con_el(String tipoDeUsuario) {
        //pageCheckOut.obtenerContenidoTabla(By.xpath("//table[@class='table table-hover mcr-table table-responsive']"),pedidoImportado);
        pageCheckOut.realizarPagoPedido(tipoDeUsuario);

    }

    //caso negativo
    @When("busco el pedido en la tabla de Mis Pedidos con el {string}")
    public void busco_el_pedido_en_la_tabla_de_mis_pedidos_con_el(String TipoUsuario) {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("numero es111111111: "+numeroOrden);
        //PageCheckOut.buscarRegistroEnTablaConError(tipousuario,numeroOrden);
        //pageCheckOut.realizarPagoPedido(TipoUsuario);
    }


}
