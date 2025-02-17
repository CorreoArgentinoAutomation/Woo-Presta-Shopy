package page.PlataformaIntegracion.Woocommerce;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Carrito extends BasePage {

    private By radioBtnSegundaOpcion = By.xpath("(//input[@class='shipping_method'])[2]");

    private By btnVerCarrito = By.xpath("(//a[@class='added_to_cart wc_forward'])[1]");
    private By btnCarrito = By.xpath("//a[@class='wp-block-pages-list__item__link wp-block-navigation-item__content']");
   // private By btnViewCart = By.xpath("(//a[@class='added_to_cart wc_forward'])[1]");
    private By btnVerCarrito2 = By.xpath("//a[contains(text(),'Ver') and @tabindex='1']");

    private By seleccionarEnvioClasico = By.xpath("(//input[@name='shipping_method[0]'])[4]");
    private By btnFinalizarCompra = By.xpath("//div[@class='wc-proceed-to-checkout']/a[contains(.,'Finalizar compra')]");//("//a[@class='checkout-button button alt wc-forward wp-element-button']");
    private By msjError = By.xpath("//div[@class='notice notice-error woocommerce-error']");

    //Actualizar envio - despues validar si se necesita una condicion para elegir.
    //===============================================================================================
    private By calcularEnvio = By.xpath("//form[@class='woocommerce-shipping-calculator']//a[contains(@class, 'shipping-calculator-button') and normalize-space(text())='Calcular envío']/following-sibling::section[@class='shipping-calculator-form']");
    private By calcularEnvioCont = By.xpath("//a[.='Calcular envío']");
    private By seleccionProvincia = By.xpath("//select[@id='calc_shipping_state']");
    private By buenosAires = By.xpath("//option[.='Buenos Aires']");
    private By campoCiudad = By.xpath("//input[@id='calc_shipping_city']");
    private By codigoPostal = By.xpath("//input[@id='calc_shipping_postcode']");
    private By btnActualizar = By.xpath("//button[@name='calc_shipping']");
    //===============================================================================================

    public Carrito(WebDriver driver) {
        super(driver);
    }

    public void verCarrito(){
        click(radioBtnSegundaOpcion);
        waitForSeconds(10);
        click(btnFinalizarCompra);
        System.out.println("Se hizo clic en el boton finalizar compra");

    }

    //1
    public void seleccionarSegundaopcionDeEnvio(){
        click(radioBtnSegundaOpcion);
    }
    //2
    public void finalizarCompra(){
        scrollPageUpDown(0,1);
        waitForSeconds(10);
        click(btnFinalizarCompra);
    }

    //Flujo a seguir en el carrito
    //1 - seleccionar una opcion de envio que sea a domicilio
    //2 - Hacer un clic en el boton "Finalizar Compra" para dirigirse al checkout


    //validar msj de error por peso

    public void validarMsjError() {
        compararTextoConMensajeEsperado(msjError, "Uno o más paquetes exceden el peso y/o medidas máximas permitidas por Correo Argentino");
    }


//flujo del carrito
//1 - click en el link de calcular envio
//2 - click en combo de de provincia
//3 - click en la opcion de Buenos Aires
//4 - ingreso de ciudad
//5 - ingreso codigo postal
//6 - click en el boton de Actualizar
//Poner una una espera aqui de 5 a 7 segundos
//7 - seleccionar alguna opcion de envio

//Para estos pasos se pueden tomar los creados en el checkout. tienen los mismo xpaths.
//7.1 - Para las opciones 1 y 4 hay que seleccionar una sucursal
//7.2 -


//agregar un swich aca y hacer dinamico la cantidad de interaciones del tab
public void calcularEnvio(){

    scrollPageUpDown(0,1);
    waitForSeconds(1);

    sendTab(7);
    sendEnter();
    //esperaImplicita(calcularEnvio);

    clickConEspera(calcularEnvioCont);

    //esperaImplicita(calcularEnvioCont);
    //click(calcularEnvioCont);
    //esperaImplicita(calcularEnvio);

    click(seleccionProvincia);
    waitForSeconds(1);
    click(buenosAires);

    //writeText(seleccionProvincia,"C");
    waitForSeconds(1);
    sendEnter();

    writeText(campoCiudad,"CABA");
    writeText(codigoPostal,"1020");

    click(btnActualizar);
    waitForSeconds(6);
    System.out.println("Opciones de envio cargadas");
}


}
