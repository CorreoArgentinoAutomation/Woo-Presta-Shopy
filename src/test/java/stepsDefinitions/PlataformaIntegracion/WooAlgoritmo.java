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


public class WooAlgoritmo {
    private WebDriver driver = DriverManager.getDriver();
    private Home home = new Home(driver);
    private String baseUrl = DriverManager.config.getProperty("urlWooCommerce");
    private Dashboard dashboard = new Dashboard(driver);
    private Carrito carrito = new Carrito(driver);
    private CheckOut checkout = new CheckOut(driver);
    private PageCheckOut pageCheckOut = new PageCheckOut(driver);

    @Given("el usuario esta en la pagina de productos")
    public void el_usuario_esta_en_la_pagina_de_productos() {
        dashboard.ingresarAProductos();
    }
    @Given("el usuario hace clic en el boton Anadir nuevo producto")
    public void el_usuario_hace_clic_en_el_boton_anadir_nuevo_producto() {
        dashboard.anadirProducto();
    }
    @Given("el usuario escribe {string} en el campo de nombre del producto")
    public void el_usuario_escribe_en_el_campo_de_nombre_del_producto(String string) {
        dashboard.nombreProducto(string);
    }
    @Given("el usuario escribe {string} en el campo de precio")
    public void el_usuario_escribe_en_el_campo_de_precio(String string) {
        dashboard.precioProducto(string);
    }
    @Given("el usuario hace clic en el boton Envio")
    public void el_usuario_hace_clic_en_el_boton_envio() {
        dashboard.menuEnvio();
    }
    @Given("el usuario ingresa {string} en el campo de peso")
    public void el_usuario_ingresa_en_el_campo_de_peso(String string) {
        dashboard.pesoProducto(string);
    }
    @Given("el usuario ingresa {string} en el campo de longitud")
    public void el_usuario_ingresa_en_el_campo_de_longitud(String string) {
        dashboard.logitudProducto(string);
    }
    @Given("el usuario ingresa {string} en el campo de ancho")
    public void el_usuario_ingresa_en_el_campo_de_ancho(String string) {
        dashboard.anchoProducto(string);
    }
    @Given("el usuario ingresa {string} en el campo de alto")
    public void el_usuario_ingresa_en_el_campo_de_alto(String string) {
        dashboard.altoProducto(string);
    }
    @Given("el usuario hace clic en el boton Publicar")
    public void el_usuario_hace_clic_en_el_boton_publicar() {
        dashboard.publicarProducto();
    }
    @Then("el producto deberia ser creado exitosamente")
    public void el_producto_deberia_ser_creado_exitosamente() {
        dashboard.validarProducto();
    }

    @Given("el usuario crea un producto con {string},{string},{string},{string},{string},{string}")
    public void el_usuario_crea_un_producto_con(String nombre, String precio, String peso, String longitud,String ancho, String alto) {
        dashboard.publicarProductos(nombre, precio, peso, longitud,ancho, alto);
    }

}
