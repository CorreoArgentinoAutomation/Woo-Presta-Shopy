package page.PlataformaIntegracion.Magento;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TiendaMagento extends BasePage {
    public TiendaMagento(WebDriver driver) {
        super(driver);
    }

    private By btnProductTest = By.xpath("//span[.='Productos Test']");
    private By buscarPaquete = By.xpath("//input[@id='search']");
    private By limiteProductos = By.xpath("//select[@id='limiter']");
    private By opcion36Productos = By.xpath("//option[contains(.,'36')]");
    private By primerProducto = By.xpath("//span[@class='product-image-container product-image-container-4']/span[@class='product-image-wrapper']");

    private By primerProducto1 = By.xpath("//ol[@class='products list items product-items']/li[@class='item product product-item']//a[contains(text(), 'Paquete 10x10x10')]");
    private By btnAgregarAlCarrito = By.xpath("//button[@id='product-addtocart-button']");
    private By btnCarrito = By.xpath("//div[@class='minicart-wrapper']/a[@href='https://magento.integracionesco.shop/checkout/cart/']");
    private By btnProcederAlCheckOut = By.xpath("//button[@id='top-cart-btn-checkout']");
    //Formnulario del checkout
    private By campoEmail = By.xpath("//input[@id='customer-email']");
    private By campoFirstName = By.xpath("//input[@name='firstname']");
    private By campoLastName = By.xpath("//input[@name='lastname']");
    private By campoDNI = By.xpath("//input[@name='custom_attributes[dni]']");
    private By campoStreetAddress = By.xpath("//fieldset[@class='field street admin__control-fields required']//div[@class='field _required']//input[@class='input-text']");
    private By campoStreetAddress2 = By.xpath("//div[@class='field additional _required']//input[@class='input-text']");
    private By campoCountry = By.xpath("//select[@name='country_id']/option[@value='AR']");
    private By campoStateProvince = By.xpath("//select[@name='region_id']/option[@value='535']");
    private By campoCity = By.xpath("//input[@name='city']");
    private By campoPostCode = By.xpath("//input[@name='postcode']");
    private By campoPhoneNumber = By.xpath("//input[@name='telephone']");
    private By campoCelular = By.xpath("//input[@name='custom_attributes[celular]']");
    //Opciones de Envio
    private By opcionDeEnvio1 = By.xpath("//td[@id='label_method_estandar_correoestandar']");
    private By opcionDeEnvio2 = By.xpath("//td[@id='label_method_estandar_correoestandarexpress']");
    private By opcionDeEnvio3 = By.xpath("//td[@id='label_method_sucursal_correosucursal']");
    private By opcionDeEnvio4 = By.xpath("//td[@id='label_method_sucursal_correosucursalexpress']");
    private By btnNest = By.xpath("//span[.='Next']");
    private By opcionDefault = By.xpath("//td[@id='label_method_flatrate_flatrate']");
    private By btnPlaceOrder = By.xpath("//span[.='Place Order']");
    private By numeroPedido = By.xpath("//p[contains(text(), 'Your order # is:')]/span");
    //private By  = By.xpath("");
    //private By  = By.xpath("");



    public void realizarPedido(String paquete) {
        /*
        String userName = "admin";
        String password = "Pomelo-03";
        writeText(buscarPaquete, Paquete);
        writeText(campoPassword, password);
        click(limiteProductos);
         */
        writeText(buscarPaquete, "Paquete");
        sendEnter();

        scrollPageUpDown(0,4);
        click(limiteProductos);
        click(opcion36Productos);

        //click(primerProducto1);

        //Hacer un switch que seleccione el paquete que quiera
        //agregarAlProductosAValidar("Paquete 10x10x10");

        switch (paquete) {
            case "paquete01":
                agregarAlProductosAValidar("Paquete 10x10x10");
                agregarAlProductosAValidar("Paquete 100x80x10");
                break;
            case "ClasicoASucursal":
                System.out.println("Opción 2 seleccionada");
                click(opcionDeEnvio2);
                break;
            case "ExpressADomicilio":
                System.out.println("Opción 3 seleccionada");
                break;
            case "ExpressASucursal":
                System.out.println("Opción 4 seleccionada");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }


        //Ir al CheckOut
        click(btnCarrito);
        click(btnProcederAlCheckOut);


        llenarFormularioChechOut();

    }

    public void agregarAlProductosAValidar(String packageName) {
        waitForSeconds(1);
       //String packageName = "Paquete 10x10x10";
        By btnCarrito = By.xpath("//ol[@class='products list items product-items']/li[@class='item product product-item']//a[contains(text(), '" + packageName + "')]");
       //waitForSeconds(1);
            click(btnCarrito);
            waitForSeconds(1);
            click(btnAgregarAlCarrito);
            waitForSeconds(4);
            writeText(buscarPaquete, "Paquete");
            sendEnter();

        scrollPageUpDown(0,4);
        click(limiteProductos);
        click(opcion36Productos);


    }

    public void llenarFormularioChechOut(){
     //Campos a llenar

     //email
        writeText(campoEmail, "prueba@pueba.com");
     //First Name
        writeText(campoFirstName, "prueba");
     //Last Name
        writeText(campoLastName, "prueba2");
     //DNI
        writeText(campoDNI, "4444444444");
     //Street Address
        writeText(campoStreetAddress, "Calle 1");
        writeText(campoStreetAddress2, "1234");
     //Country
        click(campoCountry);
     //State/Province
        click(campoStateProvince);
     //City
        writeText(campoCity,"Buenos Aires");
     //Zip/Postal Code
        writeText(campoPostCode,"1020");
     //Phone Number
        writeText(campoPhoneNumber,"12345678");
        waitForSeconds(3);
     //Celular
        writeText(campoCelular,"12345678");
        //Aca Selecionar el metodo de envio hacer una variable para que seleccione cualquiera
        // boton next

        //Seleccionar metodo de pago

        //capturar el numero de orden
    }

    public String metodoEnvio(String metodoEnvio){
         // Puedes cambiar este valor para probar diferentes casos

        switch (metodoEnvio) {
            case "fixed":
                System.out.println("fixed");
                click(opcionDefault);
                break;
            case "ClasicoADomicilio":
                System.out.println("Opción 1 seleccionada");
                click(opcionDeEnvio1);
                break;
            case "ClasicoASucursal":
                System.out.println("Opción 2 seleccionada");
                click(opcionDeEnvio2);
                break;
            case "ExpressADomicilio":
                System.out.println("Opción 3 seleccionada");
                click(opcionDeEnvio3);
                break;
            case "ExpressASucursal":
                System.out.println("Opción 4 seleccionada");
                click(opcionDeEnvio4);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }


        click(btnNest);
        waitForSeconds(2);
        click(btnPlaceOrder);

        String orderNumber = extrarNumeroDePedido(numeroPedido);
        return orderNumber;

    }

}
