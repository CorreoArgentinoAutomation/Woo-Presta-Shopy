package page.MiCorreo2;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MiCorreo2 extends BasePage {
    public MiCorreo2(WebDriver driver) {
        super(driver);
    }

    private By campoUsr = By.xpath("//input[@formcontrolname='username' and @type='email']");
    private By campoPassword = By.xpath("//input[@formcontrolname='password' and @type='password']");
    private By btnIngresar = By.xpath("//span[contains(@class, 'button-margin-internal') and contains(@class, 'ng-star-inserted') and text()='Ingresar']");
    //=========================================================================================================================================================================
    //Envios
    //=========================================================================================================================================================================
    private By btnNuevoEnvio = By.xpath("//img[@src='../../../assets/img/dashboard/add.svg']");

    private By opcionIndividual = By.xpath("//span[@class='mdc-tab__text-label' and text()='Individual']");
    private By campoName = By.xpath("//input[@formcontrolname='name' and @aria-required='true' and contains(@class, 'mat-mdc-input-element')]");

    private By campoOrigen = By.xpath("(//div[contains(@class, 'mdc-notched-outline')])[1]");
    private By listaProvincias = By.xpath("//mat-form-field[@appearance='outline' and contains(@class, 'mat-mdc-form-field') and contains(@class, 'mat-input-element') and contains(@class, 'ng-tns-c2608167813-7')]");
    private By btnSiguiente = By.xpath("//button[@class='yes']");
    private By medidaLargo = By.xpath("//input[@formcontrolname='length']");
    private By medidaAncho = By.xpath("//input[@formcontrolname='width']");
    private By medidaAlto = By.xpath("//input[@formcontrolname='height']");
    private By medidaPeso = By.xpath("//input[@formcontrolname='weight']");
    private By valor = By.xpath("//input[@formcontrolname='declaredValue']");
    private By nombreYApellido = By.xpath("//input[@formcontrolname='name']");
    private By listaProvincia = By.xpath("//span[contains(@class, 'mat-mdc-select-placeholder') and contains(@class, 'mat-mdc-select-min-line')]");
    private By campoLocalidad = By.xpath("//input[@formcontrolname='location']");
    private By campoDireccion = By.xpath("//input[@formcontrolname='address']");
    private By campoCP = By.xpath("//input[@formcontrolname='zip']");
    private By campoEmail = By.xpath("//input[@formcontrolname='email']");
    private By campoTelefono = By.xpath("//input[@formcontrolname='phone']");
    private By btnPagar = By.xpath("//button[@class='pay']");
    private By pagoSaldo = By.xpath("//label[.='Saldo']");
    private By menuPanelEnvios = By.xpath("//mat-list-item[3]/span[@class='mdc-list-item__content']");
    private By menuPanelEnviosPagados = By.xpath("//h3[.='Pagados']");
    private By btnPagados = By.xpath("//span[contains(@class, 'mdc-tab__text-label') and text()='Pagados']");
    private By tablaPagados = By.xpath("//table[contains(@class, 'mat-mdc-table')]");
    private By btnMicuenta = By.xpath("//p[@class='menu-list-profile-user' and contains(text(), 'Mi cuenta')]");
    private By opcionesConfiguracion = By.xpath("//span[contains(.,'Configuración')]");

    // Configuraciones de la cuenta
    private By campoNombre = By.xpath("//mat-form-field[contains(@class, 'mat-mdc-form-field') and .//mat-label[contains(text(), 'Nombre')]]//input");
    private By campoApellido = By.xpath("(//mat-form-field[contains(@class, 'mat-mdc-form-field') and .//mat-label[contains(text(), 'Apellido')]])[1]//input");
    //private By  = By.xpath("");
    private By campoTelefonoConfiguracion = By.xpath("(//mat-form-field[contains(@class, 'mat-mdc-form-field') and .//mat-label[contains(text(), 'Celular')]])[1]//input");
    private By btnConfirmar = By.xpath("//span[contains(.,'Confirmar')]");

    // Configuraciones de Facturacion

    private By datosDeUsuario = By.xpath("//button[contains(@class, 'item') and contains(text(), 'Datos de usuario')]");
    private By informacionDeLaCuenta = By.xpath("//button[contains(@class, 'item') and contains(text(), 'Información de la cuenta')]");
    private By domicilios = By.xpath("//button[contains(@class, 'item') and contains(text(), 'Domicilios')]");
    private By medidasFrecuentes = By.xpath("//button[contains(@class, 'item') and contains(text(), 'Medidas frecuentes')]");
    private By usuariosInvitados = By.xpath("//button[contains(@class, 'item') and contains(text(), 'Usuarios invitados')]");

    // Configuraciones de Domicilios Pick UP
    private By btnPickUp = By.xpath("//span[contains(@class, 'mdc-tab__text-label') and contains(text(), 'Pick up')]");
    private By campoAlias = By.xpath("//input[@formcontrolname='alias' and contains(@class, 'mat-mdc-input-element')]");
    private By campoTelefonoPickUp = By.xpath("//input[@formcontrolname='cellphone' and contains(@class, 'mat-mdc-input-element')]");
    private By campoPropiedad = By.xpath("//input[@formcontrolname='name' and contains(@class, 'mat-mdc-input-element')]");
    private By campoCorreoElectronico = By.xpath("//label[contains(@class, 'mdc-floating-label') and .//mat-label[contains(text(), 'Correo electrónico')]]");
    private By listaProvinciaConfiguracion = By.xpath("//mat-select[@formcontrolname='province' and contains(@class, 'mat-mdc-select')]");
    private By listaFranjaHoraria = By.xpath("//mat-label[contains(@class, 'ng-tns-c2608167813-55') and contains(text(), 'Franja horaria')]");

    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");




    public void loginMiCorreo2() {
        String userName = "Automationpi@yopmail.com";
        String password = "123123Aa@";
        writeText(campoUsr, userName);
        writeText(campoPassword, password);
        click(btnIngresar);
    }

    public void tipoDeEnvio() {
        waitForSeconds(1);
        click(btnNuevoEnvio);
        click(opcionIndividual);


    }

    public void tipoDeEntrega(){
        waitForSeconds(1);
        writeText(campoName, "Automation Test");
        click(listaProvincias);
        sendEnter();
        click(btnSiguiente);

        //Configuracion de la medida del paquete
        writeText(medidaLargo, "10");
        writeText(medidaAncho, "10");
        writeText(medidaAlto, "10");
        writeText(medidaPeso, "5");
        writeText(valor, "5");
        click(btnSiguiente);

        //Destino

        writeText(nombreYApellido, "Nombre Apellido");
        click(listaProvincia);
        sendEnter();
        writeText(campoLocalidad, "Aguero");
        writeText(campoDireccion, "2502");
        writeText(campoCP, "1020");
        writeText(campoEmail, "prueba@correo.com");
        writeText(campoTelefono, "3804564576");

        waitForSeconds(4);

        //Opcion de envio
        //click();
        System.out.println("1");
        click(btnPagar);
        System.out.println("2");

/*

        waitForSeconds(3);
        click(pagoSaldo);
        System.out.println("3");

 */
        click(btnSiguiente);



        //Probar recargar
        waitForSeconds(3);
        recargar(3);
        waitForSeconds(10);

    }

    public void validarPago(){
        click(menuPanelEnvios);
        click(menuPanelEnviosPagados);
        waitForSeconds(3);
        click(btnPagados);
        //recargar(3);
        buscarEnTabla(tablaPagados);
    }

    public void configuracionCuenta(){
        click(btnMicuenta);
        waitForSeconds(2);
        /*
        scrollToElement(opcionesConfiguracion);
        click(opcionesConfiguracion);
         */
        sendFlechaAbajo(1);
        sendEnter();
    }

    public void cambioDeDatos(){
        String Nombre = generadorNombresReales();
        String Apellido = generadorApellidosReales();
        //el usuario es el Correo
        //String Usuario = generadornombres();
        String Telefono = generadorNumeroTelefono();

        writeText(campoNombre, Nombre);
        writeText(campoApellido, Apellido);
        //writeText(campoLocalidad, "Aguero");
        writeText(campoTelefonoConfiguracion, Telefono);

        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: "+Apellido);
        //System.out.println("Telefono: "+Telefono);
        System.out.println("Telefono: "+Telefono);


        click(btnSiguiente);
        waitForSeconds(1);
        click(btnConfirmar);
    }

    public void cambioInfoCuenta(){
        click(informacionDeLaCuenta);

        //Datos de facturacion
        System.out.println("No se puede cambiar los datos de facturacion en la cuenta con consumidor final");

    }
    public void cambioDomiciliosPickUp(){
        click(domicilios);
        click(btnPickUp);

        writeText(campoAlias, "Automation");
        writeText(campoTelefonoPickUp, generadorNumeroTelefono());
        writeText(campoPropiedad, "Razon Social");
        writeText(campoCorreoElectronico, "prueba@correo.com");

        click(listaProvinciaConfiguracion);
        sendEnter();

        click(listaFranjaHoraria);
        sendEnter();

        /*
        writeText(, "");
        writeText(, "");
        writeText(, "");
        writeText(, "");
        writeText(, "");
        writeText(, "");


         */

        //Datos de facturacion
        System.out.println("No se puede cambiar los datos de facturacion en la cuenta con consumidor final");

    }
}
