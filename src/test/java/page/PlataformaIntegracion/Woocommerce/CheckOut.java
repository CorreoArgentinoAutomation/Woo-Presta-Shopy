package page.PlataformaIntegracion.Woocommerce;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut extends BasePage {

    private By radioBtnPrimeraOpcion = By.xpath("(//input[@class='shipping_method'])[1]");
    private By radioBtnSegundaOpcion = By.xpath("(//input[@class='shipping_method'])[2]");
    private By radioBtnTerceraOpcion = By.xpath("(//input[@class='shipping_method'])[3]");
    private By radioBtnCuartaOpcion = By.xpath("(//input[@class='shipping_method'])[4]");
    private By listaDeSucursales = By.xpath("//span[@class='select2-dropdown select2-dropdown--below']");

    private By cuadroTexto = By.xpath("//input[@class='select2-search__field']");
    private By btnseleccionSucursal = By.xpath("(//span[@class='select2-selection__rendered'])[2]");
    private By seleccionPrimeraSucursal = By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']");
    private By checkEnvioAlterno = By.xpath("//input[@id='ship-to-different-address-checkbox']");
    private By btnFinalizarCompra = By.xpath("//a[@class='checkout-button button alt wc-forward wp-element-button']");
    private By btnRealizarElPedido = By.xpath("//button[@class='button alt wp-element-button']");
    private By btnRealizaPedido = By.xpath("//button[@value='Realizar el pedido' and @data-value='Realizar el pedido']");
    private By totalDeArriba = By.xpath("(//span[@class='wc-block-order-confirmation-summary-list-item__value'])[3]");
    private By totalDeAbajo = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[14]");
    //private By numeroPedido = By.xpath("//*[@class='woocommerce-order-overview__order order' and strong]");
    private By numeroPedido = By.xpath("(//span[@class='wc-block-order-confirmation-summary-list-item__value'])[1]");
    private By correoUsLocator = By.xpath("(//span[@class='wc-block-order-confirmation-summary-list-item__value'])[4]");
    private By fechaLocator = By.xpath("(//span[@class='wc-block-order-confirmation-summary-list-item__value'])[2]");

    public CheckOut(WebDriver driver) {
        super(driver);
    }

    public void checkTienda(){
        waitForSeconds(1);
        System.out.println("se hace un clic en el Finalizar Compra");
        click(checkEnvioAlterno);
        System.out.println("Click en el check de envio alterno");
        waitForSeconds(10);
        //click(radioBtnSegundaOpcion);
        scrollPageUpDown(0,3);
    }




    //1 - 2
    public void quitarEnvioAlterno(){
        waitForSeconds(1);
        click(checkEnvioAlterno);
        scrollPageUpDown(0,3);
    }

    //2
    public void seleccionOpcionEnvioDomicioOp2(){
        waitForSeconds(32);
        click(radioBtnSegundaOpcion);


    }
    public void seleccionOpcionSucursalOp4(){
        waitForSeconds(32);
        click(radioBtnCuartaOpcion);

    }

    //3
    public void seleccionOpcionSucursalOp1(){
        waitForSeconds(32);
        click(radioBtnPrimeraOpcion);

    }
    public void seleccionOpcionEnvioDomicioOp3(){
        waitForSeconds(32);
        click(radioBtnTerceraOpcion);
    }
    //4
    public void seleccionarEnvioSucursal(){
        waitForSeconds(32);
        click(btnseleccionSucursal);
    }
    //5
    public void escribirEnSucursal(){
        //for(int i=0;i<7;i++){
        click(cuadroTexto);
        writeText(cuadroTexto,"Capital");
        //System.out.println("Esta es la ejecución número: " + (i + 1));
        sendEnter();
        //}
    }

    //6
    public void finalizarPedido(){
        waitForSeconds(28);
        scrollPageUpDown(0,1);
        click(btnRealizarElPedido);
        waitForSeconds(10);
        mostrarDatosDelPedido();
    }

    //7
    public void mostrarDatosDelPedido(){
        String NpedidoTienda =  extraerNumeros(numeroPedido);
        String FechaPedido = getText(fechaLocator);
        String CorreoUser = getText(correoUsLocator);
        String Total =  getText(totalDeArriba);
        System.out.println("--------------------------------"+
                "\nDatos del Checkout: \n" + NpedidoTienda + "\n"
                + FechaPedido + "\n" + CorreoUser + "\n" + Total +
                "\n--------------------------------");

    }

    //Flujo a seguir en el checkout
    //1 - Quitar el check del envio alterno
    //2 - Hacer un scroll hacia abajo y esperar que carguen la opciones de envio
    //3 - Seleccionar la primera opcion de envio y que sea un envio a sucursal
    //4 - Seleccionar el envio a sucursal
    //5 - Escribir en el cuadro de texto de sucursal y seleccionar la primera opcion
    //6 - Hacer un clic en el boton de Finalizar pedido y se redirigira al detalle del pedido
    //7 - Capturar los datos del pedido


    public void generarPedidoCheckOut(){
        quitarEnvioAlterno();
        seleccionOpcionEnvioDomicioOp2();
        finalizarPedido();
        mostrarDatosDelPedido();
    }

}


