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


public class WoocommerceAlternoSteps {
    private WebDriver driver = DriverManager.getDriver();
    private Home home = new Home(driver);
    private String baseUrl = DriverManager.config.getProperty("urlWooCommerce");
    private Dashboard dashboard = new Dashboard(driver);
    private Carrito carrito = new Carrito(driver);
    private CheckOut checkout = new CheckOut(driver);
    private PageCheckOut pageCheckOut = new PageCheckOut(driver);

    private String pedidoImportado;
    @Given("que abro el dashboard de WordPress")
    public void que_abro_el_dashboard_de_word_press() {
        driver.get(baseUrl);
        System.out.println("el usuario se situa en el ambiente de pruebas");
    }
    @Given("valido que los campos de usuario y contrasena existan")
    public void valido_que_los_campos_de_usuario_y_contrasena_existan() {
        dashboard.verificarUsrAndPass();
        System.out.println("visualiza los campos de usuario y contrasena");
    }
    @Given("me logueo ingresando usuario y contrasena")
    public void me_logueo_ingresando_usuario_y_contrasena() {
        waitForSeconds(2);
        dashboard.login();
        System.out.println("Inicio de sesion exitoso");
    }
    @Given("valido los submenus del plugin de Correo Argentino")
    public void valido_los_submenus_del_plugin_de_correo_argentino() {dashboard.validarSubMenu();}
    @Given("ingreso al Ecommerce")
    public void ingreso_al_ecommerce() {dashboard.ingresarEcommerce();}
    @Given("me dirijo a la tienda que contiene los productos")
    public void me_dirijo_a_la_tienda_que_contiene_los_productos() {home.irAlTienda();}
    @When("agrego algun producto al carrito y espero que se cargue en el carrito")
    public void agrego_algun_producto_al_carrito_y_espero_que_se_cargue_en_el_carrito() {home.agregarAlProductoCarrito();}
    @When("me dirijo al Carrito")
    public void me_dirijo_al_carrito() {home.irAlCarrito();}
    @When("selecciono una opcion de envio que sea a domicilio")
    public void selecciono_una_opcion_de_envio_que_sea_a_domicilio() {carrito.seleccionarSegundaopcionDeEnvio();}
    @When("hago clic en el boton Finalizar Compra para dirigirme al checkout")
    public void hago_clic_en_el_boton_para_dirigirme_al_checkout() {carrito.finalizarCompra();}
    @When("quito el check del envio alterno")
    public void quito_el_check_del_envio_alterno() {checkout.quitarEnvioAlterno();}
    @When("selecciono la primera opcion de envio y que sea un envio a sucursal")
    public void selecciono_la_primera_opcion_de_envio_y_que_sea_un_envio_a_sucursal() {checkout.seleccionOpcionSucursalOp1();
    }
    @When("selecciono el envio a sucursal")
    public void selecciono_el_envio_a_sucursal() {checkout.seleccionarEnvioSucursal();
    }
    @When("escribo en el cuadro de texto de sucursal y selecciono la primera opcion")
    public void escribo_en_el_cuadro_de_texto_de_sucursal_y_selecciono_la_primera_opcion() {checkout.escribirEnSucursal();}
    @When("hago clic en el boton de Finalizar pedido y me redirijo al detalle del pedido")
    public void hago_clic_en_el_boton_de_finalizar_pedido_y_me_redirijo_al_detalle_del_pedido() {checkout.finalizarPedido();}
    @Then("capturo los datos del pedido")
    public void capturo_los_datos_del_pedido() {checkout.mostrarDatosDelPedido();}
    @Then("visualizo el numero del pedido")
    public void visualizo_el_numero_del_pedido() {
        pedidoImportado = dashboard.importarPedido();
        System.out.println("Importacion Exitosa! Pedido: " + pedidoImportado);
    }
    @Then("visualizo la guia de la plataforma de mi correo")
    public void visualizo_la_guia_de_la_plataforma_de_mi_correo() {pageCheckOut.visualizarGrillaMiCorreo();
    }
    @Then("comparo el numero de pedido del Ecommerce con el de Mi Correo")
    public void comparo_el_numero_de_pedido_del_ecommerce_con_el_de_mi_correo() {
        pageCheckOut.obtenerContenidoTabla(By.xpath("//table[@class='table table-hover mcr-table table-responsive']"),pedidoImportado);
    }

    //Opciones de envio
    @When("selecciono la tercera opcion de envio")
    public void seleccionoLaTerceraOpcionDeEnvio() {
        checkout.seleccionOpcionEnvioDomicioOp3();
    }
    @When("selecciono la cuarta opcion de envio y que sea un envio a sucursal")
    public void seleccionoLaCuartaOpcionDeEnvioYQueSeaUnEnvioASucursal() {
        checkout.seleccionOpcionSucursalOp4();
    }

    @When("selecciono la segunda opcion de envio")
    public void seleccionoLaSegundaOpcionDeEnvio() {
        checkout.seleccionOpcionEnvioDomicioOp2();
    }
    @Then("Valido que el cambio de estado del pedido")
    public void validoQueElCambioDeEstadoDelPedido() {
        dashboard.validarCambioDeEstado();
    }

    @Then("Valido que el cambio de estado todos los pedidos")
    public void validoQueElCambioDeEstadoTodosLosPedido() {
        dashboard.validarCambioDeEstado();
    }

    @Then("Valido que el cambio de estado de todos los pedidos")
    public void validoQueElCambioDeEstadoDeTodosLosPedido() {
        dashboard.validarCambioDeMensajeDeConfirmacion();
    }

    //Pedidos de PaqAr
    @Then("importo el pedido y lo selecciono")
    public void importoElPedidoYLoSelecciono() {
        pedidoImportado = dashboard.importarPedidoPaqAr();
        System.out.println("Importacion Exitosa! Pedido: " + pedidoImportado);
    }

    //Cancelar Pedido PaqAr
    @Then("importo el pedido y lo selecciono cambiando el estado a cancelado")
    public void importoElPedidoYLoSeleccionoCambiandoElEstadoACancelado() {
        pedidoImportado = dashboard.importarPedidoPaqArCancelar();
        System.out.println("Importacion Exitosa! Pedido: " + pedidoImportado);
    }
    @Then("selecciono todos los pedidos cambiando el estado a cancelado")
    public void seleccionoTodosLosPedidosCambiandoElEstadoACancelado() {
        dashboard.cambiarDeEstadoPedidoPaqArCanceladoMasivo();
    }
    @Then("selecciono todos los pedidos cambiando el estado a completado")
    public void seleccionoTodosLosPedidosCambiandoElEstadoACompletado() {
        dashboard.cambiarDeEstadoPedidoPaqArCompletadoMasivo();
    }

    //Outline login
    @When("ingreso el {string}")
    public void ingresoEl(String tipoUsuario) {
        dashboard.seleccionoUsuario(tipoUsuario);
    }

    @Given("configuro el plugin de mi correo con el {string}")
    public void configuro_el_plugin_de_mi_correo_con_el(String string) {
        driver.get(baseUrl);
        dashboard.ingresarAWordPres();

        dashboard.irAlMenuPlugin();

        dashboard.desactivarPlugin();

        dashboard.activarPlugin();

        dashboard.validarSubMenuSinLogin();

        dashboard.ingresarAConexionApi();

        dashboard.seleccionarServicio();

        dashboard.seleccionoMiCorreo();

        dashboard.seleccionarCotizador();

        dashboard.seleccionarOpcionCotizador();

        dashboard.guardarCambios();

        dashboard.seleccionoUsuario(string);

        dashboard.llenarFormularioDeNegocio();

        dashboard.validarMensajeGuardado();
    }

    //login ParAr
    @Given("configuro el plugin de mi correo con el usuario PaqAr")
    public void configuro_el_plugin_de_mi_correo_con_el_usuario_paq_ar() {
        driver.get(baseUrl);
        dashboard.ingresarAWordPres();

        dashboard.irAlMenuPlugin();

        dashboard.desactivarPlugin();

        dashboard.activarPlugin();

        dashboard.validarSubMenuSinLogin();

        dashboard.ingresarAConexionApi();

        dashboard.seleccionarServicio();

        dashboard.seleccionoPaqAr();

        dashboard.guardarCambios();

        dashboard.ingresoDeAcuerdoYClaveAPI();

        dashboard.llenarFormularioDeNegocio();

        dashboard.validarMensajeGuardado();

    }
    //selecciono el paquete que quiero
    @Given("selecciono el paquete que quiera {string}")
    public void selecciono_el_paquete_que_quiera(String string) {
        dashboard.crearProductos(string);
    }

    @Given("selecciono el {string} que quiero")
    public void selecciono_el_que_quiero(String string) {
        //dashboard.seleccionoProducto(string);
        dashboard.crearProductos(string);
    }

    @Given("Agrego los productos al carrito segun el {string}")
    public void agrego_los_productos_al_carrito_segun_el(String string) {
        dashboard.ingresarEcommerce();
        home.irAlTienda();
        //home.agregarAlProductosAValidar(string);
        //esta funcion abria que moverla a la PAge de Carrito
        home.seleccionarLosProductosNecesarios(string);
        checkout.quitarEnvioAlterno();
        checkout.seleccionOpcionEnvioDomicioOp2();
        checkout.finalizarPedido();
        checkout.mostrarDatosDelPedido();

        pedidoImportado = dashboard.importarPedido();
        System.out.println("El numero del pedido es: " + pedidoImportado);
    }


    @Given("valido las medidas del {string} con el {string}")
    public void valido_las_medidas_del_con_el(String paquete, String tipoDeUsuario) {
        pageCheckOut.validarMedidas(paquete,pedidoImportado,tipoDeUsuario);
    }


    @Given("valido mensaje de error en el {string}")
    public void valido_mensaje_de_error_en_el(String paquete) {
        dashboard.ingresarEcommerce();
        home.irAlTienda();
        home.seleccionarLosProductosNecesarios(paquete);
        carrito.validarMsjError();
    }


}
