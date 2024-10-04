package page.PlataformaIntegracion.Presta;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPresta extends BasePage {
    public CheckOutPresta(WebDriver driver) {
        super(driver);
    }

    private By btnContinuar = By.xpath("//button[@type='submit' and @class='btn btn-primary continue float-xs-right']");
    private By envioOp1 = By.xpath("//div[@class='delivery-options']/div[1]/div[@class='col-sm-1']");
    private By envioOp2 = By.xpath("//div[@class='delivery-options']/div[4]//span[@class='custom-radio float-xs-left']");
    private By envioOp3 = By.xpath("//div[@class='delivery-options']/div[7]/div[@class='col-sm-1']");
    private By envioOp4 = By.xpath("//div[10]/div[@class='col-sm-1']");

    private By provincia = By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--focus']//span[@class='select2-selection__rendered']");
    private By txtProvincia = By.xpath("//input[@class='select2-search__field']");


    private By btnContinuarEnvio = By.xpath("(//button[@type='submit' and @class='continue btn btn-primary float-xs-right'])[2]");
    private By radioButtonMedioDePago = By.xpath("//input[@class='ps-shown-by-js ' and @id='payment-option-1']");
    private By checkEstoyDeAcuerdo = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]' and @class='ps-shown-by-js']");
    private By btnRealikzarPedido = By.xpath("//button[@type='submit' and @class='btn btn-primary center-block']");
    private By validacionDePedido= By.xpath("//h3[@class='h1 card-title']");

    //Usuario invitado
    private By radioSr = By.xpath("//div[@class='col-md-6 js-input-column form-control-valign']//input[@value='1']");
    private By campoNombre = By.xpath("//input[@id='field-firstname']");
    private By campoApellido = By.xpath("//input[@id='field-lastname']");
    private By campoEmail = By.xpath("//form[@id='customer-form']//input[@id='field-email']");
    private By checkIAgree = By.xpath("//div[8]/div[@class='col-md-6 js-input-column']//label[1]");
    private By checkPrivacidad = By.xpath("//div[10]/div[@class='col-md-6 js-input-column']//label[1]");
    private By btnContinuarUsrInvitado= By.xpath("//footer[@class='form-footer clearfix']/button[@name='continue']");
    private By campoDireccion = By.xpath("//section[@class='form-fields']/div[5]//input[@class='form-control']");
    private By campoCodigoPostal = By.xpath("//input[@id='field-postcode']");
    private By campoCiudad = By.xpath("//input[@id='field-city']");
    private By seleccionBuenosAires = By.xpath("//select[@id='field-id_state']/option[@value='102']");
    private By seleccionCatamarca = By.xpath("//select[@id='field-id_state']/option[@value='103']");
    private By btnContinuarDirecciones = By.xpath("//button[@name='confirm-addresses']");
    private By btnContinuarMedioEnvio = By.xpath("//button[@name='confirmDeliveryOption']");
    private By infoEnvio = By.xpath("//li[@id='order-reference-value']");
    //private By = By.xpath("");
    //private By = By.xpath("");
    //private By = By.xpath("");

    public void continuidadDelCheckOut(){
        click(btnContinuar);
    }

    public void usuarioInvitadoDatosPersonales(){
        click(radioSr);
        click(campoNombre);
        writeText(campoNombre, "Calos");
        click(campoApellido);
        writeText(campoApellido, "Test");
        String email = generadorCorreos();
        click(campoEmail);
        writeText(campoEmail, email);

        click(checkIAgree);
        click(checkPrivacidad);

        click(btnContinuarUsrInvitado);
    }
    public void usuarioInvitadoDirecciones(){
        click(campoDireccion);
        writeText(campoDireccion, "Soberania Nacional");
        click(campoCodigoPostal);
        writeText(campoCodigoPostal, "B6740FGD");
        click(campoCiudad);
        writeText(campoCiudad, "Chacabuco");
        click(seleccionBuenosAires);

        click(btnContinuarDirecciones);
        waitForSeconds(8);
    }

    public void usuarioInvitadoDireccionesNegativo(){
        click(campoDireccion);
        writeText(campoDireccion, "Soberania Nacional");
        click(campoCodigoPostal);
        writeText(campoCodigoPostal, "B6740FGD");
        click(campoCiudad);
        writeText(campoCiudad, "Chacabuco");
        click(seleccionCatamarca);

        click(btnContinuarDirecciones);
        waitForSeconds(8);
    }





    public void seleccionDeEnvioOp(String opcionEnvio) {
        switch (opcionEnvio){
            case "seleccionDeEnvioOp1":
                seleccionDeEnvioOp1();
                break;
            case "seleccionDeEnvioOp2":
                seleccionDeEnvioOp2();
                break;
            case "seleccionDeEnvioOp3":
                seleccionDeEnvioOp3();
                break;
            case "seleccionDeEnvioOp4":
                seleccionDeEnvioOp4();
                break;
            default:
                System.out.println("No Esta definido ese usuario: " + opcionEnvio + "no existe");
        }
        click(btnContinuarMedioEnvio);
        click(radioButtonMedioDePago);
        click(checkEstoyDeAcuerdo);
        click(btnRealikzarPedido);
    }


    public void seleccionDeEnvioOp1(){
        click(envioOp1);
    }
    public void seleccionDeEnvioOp2(){
        click(envioOp2);
    }
    public void seleccionDeEnvioOp3(){
        click(envioOp3);
    }
    public void seleccionDeEnvioOp4(){
        click(envioOp4);
    }

    public void validacionDePedido(){
        compararTextoConMensajeEsperado(validacionDePedido, "Su pedido está confirmado");
    }

    public String informacionEnvio(){
        //poner la variable en step
        String referenciaPedido = extraerTextoPedido(infoEnvio);
        System.out.println("Referencia de pedido: " + referenciaPedido);
        return(referenciaPedido);
    }



}
