package page.MiCorreo1_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import framework.BasePage;

public class PageNuevoEnvio extends BasePage {
    private By nuevoEnvioLocator = By.xpath("//li[@class='nav-item px-2 centrarDiv']");
    private By campoLargoLocator = By.xpath("//input[@id='largo']");
    private By campoAnchoLocator = By.xpath("//input[@id='ancho']");
    private By campoAltoLocator = By.xpath("//input[@id='alto']");
    private By campoPesoLocator = By.xpath("//input[@id='peso']");
    private By campoValorDelContenido = By.xpath("//input[@id='valorContenido']");
    public By btnNextLocator = By.xpath("//button[@id='next']");
    private By tipoDeEntrega = By.xpath("//select[@id='tipoEntrega']");
    private By entregaDomicilio = By.xpath("//option[@value='domicilio']");
    private By entregaSucursal = By.xpath("//option[@value='sucursal']");
    private By nomApellidoLocator = By.xpath("//input[@id='nars']");
    private By nomApellidoLocatoSuc = By.xpath("//input[@id='nars2']");
    private By seleccionarProvOrigen = By.xpath("//select[@name='sucursalProvinciaOrigen' and @id='sucursalProvinciaOrigen']");
    private By seleccionarProvOrigenSuc = By.xpath("//select[@id='provincia2']");
    private By provinciaCatamarca = By.xpath("//select[@name='sucursalProvinciaOrigen']//option[@value='K']");
    private By seleccionarProvincia = By.xpath("//select[@name='provincia' and @id='provincia']");
    private By provinciaCordoba = By.xpath("(//*[text() = 'CORDOBA'])[2]");
    private By provinciaCordobaDest = By.xpath("//select[@name='provincia2']/option[7]");
    private By correoElectronicoSuc = By.xpath("//input[@id='correoElectronico2']");
    private By celularSuc = By.xpath("//input[@id='celular2']");
    private By getSeleccionarLocalidadSuc = By.xpath("//select[@id='sucursalDestino2']");
    private By seleccionarLocalidadOrigen = By.xpath("//select[@name='sucursalOrigen'and@id='sucursalOrigen']");
    private By localidadBelen = By.xpath("//option[@value='K0006' and @class='4750']");
    private By localidadLocator = By.xpath("//input[@id='localidad']");
    private By direccionLocator = By.xpath("//input[@id='direCompleta']");
    private By codPostalLocator = By.xpath("//input[@id='cpCpa']");
    private By correoElectronico = By.xpath("//input[@id='correoElectronico']");
    private By celularLocator = By.xpath("//input[@id='celular']");
    private By observacionesLocator = By.xpath("//textarea[@id='observaciones']");
    private By envioExpresoLocator = By.xpath("//input[@class='form-check-input EXPRESO']");
    private By envioClasicoLocator = By.xpath("//input[@class='form-check-input CLASICO']");
    private By pagoSaldo = By.xpath("//input[@id='radioSaldo']");
    private By pagoCtaCte = By.xpath("//input[@id='radioCuentaCorriente']");
    private By pagoTarjeta = By.xpath("//input[@class='form-check-input' and @id='radioTarjeta']");
    private By pagoMercadoPago = By.xpath("//input[@class='form-check-input' and @id='radioMercadoPago']");
    private By nuevaTarjetaMP = By.xpath("//label[@class=\"options-list__label\" and @for=\"new_card_row\"]");
    private By dosTarjetasMP = By.xpath("//label[@class=\"options-list__label\" and @for=\"split_cards_row\"]");
    private By numeroTarjetaMP = By.id("cardNumber");
    private By numeroTarjetaUnoMP = By.id("card_number");
    private By nombreTitularMP = By.xpath("//input[@name='[ui_components][group_content][group_scroller][group_form][controls][top_card_group][fullname]']");
    private By nombreTitularUnoMP = By.id("full_name_id");
    private By nombreTitularDosMP = By.xpath("");
    private By mesVencimientoUnoMP = By.xpath("//span[normalize-space()='MM']");
    private By noviembreMP = By.xpath("//span[normalize-space()=11]");
    private By anoVencimientoUnoMP = By.xpath("//span[normalize-space()='AA']");
    private By veinticincoAnoMP = By.xpath("//span[normalize-space()='2025']");
    private By codSeguridadUnoMP = By.xpath("//input[@id='cvv']");
    private By documentoUnoMP = By.xpath("//input[@type='text'and@id='number']");
    private By VencimientoMP = By.id("expirationDate");
    private By codSeguridadMP = By.id("securityCode");
    private By btnContinuarMP = By.xpath("//button[@id='submit']");
    private By numeroDNIMP = By.xpath("//input[@id='number']");
    private By MailMP = By.xpath("//input[@id='email']");
    private By btnPagarLocator = By.xpath("//button[@type='button' and @id='pagar' and text()='Pagar']");
    private By btnPagarMP = By.xpath("//button[@id=\"pay\"]");
    private By btnPagar2 = By.xpath("//button[@id='btnPagar']");
    protected By visaLocator = By.xpath("//label[@title='Visa']");
    protected By numeroTarjeta = By.xpath("//input[@id='card_number']");
    protected By codSeguridad = By.xpath("//input[@id='security_code']");
    protected By mesVencimiento = By.xpath("//input[@id='card_expiration_month']");
    protected By anoVencimiento = By.xpath("//input[@id='card_expiration_year']");
    protected By nombreTitular = By.xpath("//input[@id='card_holder_name']");
    protected By numeroDocumento = By.xpath("//input[@id='card_holder_doc_number']");
    private By codigoTN = By.xpath("(//td[@class='table-text text-center']//div)[9]");

    public PageNuevoEnvio(WebDriver driver) {
        super(driver);
    }

    public void caracteristicasDelPaquete(){
        writeText(campoLargoLocator, "25");
        writeText(campoAnchoLocator,"20");
        writeText(campoAltoLocator, "25");
        writeText(campoPesoLocator, "5");
        writeText(campoValorDelContenido, "6500");
        waitForSeconds(1);
        try{
            click(btnNextLocator);
        }catch (Exception e){
            click(btnNextLocator);
        }
    }
    public void tipoEntrega(String tipoEntrega){
        click(tipoDeEntrega);
        waitForSeconds(2);
        if (tipoEntrega.equals("Domicilio")) {
            entregaDomicilio();
        } else if (tipoEntrega.equals("Sucursal")) {
            entregaSucursal();
        } else {
            throw new IllegalArgumentException("Tipo de entrega no válido: " + tipoEntrega);
        }
    }
    private void entregaDomicilio(){
        click(entregaDomicilio);
        writeText(nomApellidoLocator, "Juan Perez");
        waitForSeconds(1);
        click(seleccionarProvincia);
        waitForSeconds(2);
        selectOptionFromDropdownByValue("provincia", "X");
        writeText(localidadLocator, "CORDOBA");
        writeText(direccionLocator,"Rivadavia 1200");
        writeText(codPostalLocator,"5000");
        writeText(correoElectronico,"hola1@yopmail.com");
        writeText(celularLocator,"351456789");
        writeText(observacionesLocator,"Casa con rejas negras");
        waitForSeconds(3);
    }
    private void entregaSucursal(){
        click(entregaSucursal);
        writeText(nomApellidoLocatoSuc,"Carlos Sanchez");
        waitForSeconds(1);
        click(seleccionarProvOrigenSuc);
        waitForSeconds(1);
        selectOptionFromDropdownByValue("provincia2","F");
        waitForSeconds(2);
        selectOptionFromDropdownByValue("sucursalDestino2","5360");
        waitForSeconds(1);
        writeText(correoElectronicoSuc,"hola2@yopmail.com");
        writeText(celularSuc,"3825564354");
        waitForSeconds(3);
    }
    public void tipoProducto(String tipoProducto){
        if (tipoProducto.equals("Clasico")) {
            clasico();
        } else if (tipoProducto.equals("Expreso")) {
            expreso();
        } else {
            throw new IllegalArgumentException("Tipo de producto no válido: " + tipoProducto);
        }
        preionarPagar1();
    }
    public void expreso(){
        clickWithRetry(envioExpresoLocator);
        waitForSeconds(2);
    }
    public void clasico(){
        clickWithRetry(envioClasicoLocator);
        waitForSeconds(2);
    }
    public void preionarPagar1(){clickDoble(btnPagarLocator);waitForSeconds(1);}


    public void MPUnaTarjeta(){
        waitForSeconds(2);
        click(btnPagarLocator);
        waitForSeconds(2);
        click(pagoMercadoPago);
        waitForSeconds(2);
        try {
            click(btnPagar2);
        }catch(Exception e){
            click(btnPagar2);}
        completarFormularioMercadoPago();
        waitForSeconds(5);
    }

    public void EmpDomicilioClasicoMPDosTarjetas(){
        waitForSeconds(2);
        try{
            click(btnNextLocator);
        }catch (Exception e){
            click(btnNextLocator);
        }
        waitForSeconds(2);
        click(btnPagarLocator);
        waitForSeconds(2);
        click(pagoMercadoPago);
        waitForSeconds(2);
        completarFormularioMercadoPagoDosTarjetas();
    }

    public void completarFormularioMercadoPago(){
        WebElement iframe = findElement(By.tagName("iframe"));
        switchToFrame(iframe);
        // Aceptar cookies si es necesario
        if (elementExists(By.xpath("//button[text()='Aceptar cookies']")) ) {
            click(By.xpath("//button[text()='Aceptar cookies']"));
        }
        click(nuevaTarjetaMP);
// Aceptar cookies nuevamente si es necesario
        if (elementExists(By.xpath("//*[contains(text(),'Aceptar cookies')]")) ) {
            click(By.xpath("//*[contains(text(),'Aceptar cookies')]"));
        }
        waitForSeconds(2);
        switchToFrame(findElement(By.xpath("//*[@id=\"card_number\"]/iframe")));
        writeText(numeroTarjetaMP, "4509953566233704");
        waitForSeconds(2);
        switchToParentFrame();
        writeText(nombreTitularMP, "APRO");
        switchToFrame(findElement(By.xpath("//*[@id=\"expiration_date\"]/iframe")));
        writeText(VencimientoMP, "1125");
        switchToParentFrame();
        switchToFrame(findElement(By.xpath("//*[@id=\"cvv\"]/iframe")));
        writeText(codSeguridadMP, "123");
        switchToParentFrame();
        click(btnContinuarMP);
        writeText(numeroDNIMP, "11111111");
        click(btnContinuarMP);
        waitForSeconds(2);
        writeText(MailMP, "pepe@correoargentino.com.ar");
        waitForSeconds(1);
        click(btnPagarMP);
        waitForSeconds(3);
        // Verificar si aparecen mensajes de error
        if (elementExists(By.xpath("(//*[normalize-space()='Algo salió mal...'])[1]")) ||
            elementExists(By.xpath("(//*[normalize-space()='No pudimos procesar tu pago'])[1]"))){
            // Realizar acciones en caso de error
            System.out.println("Algo salio mal...\nNo pudimos procesar tu pago\n");
            click(By.id("mp-close-btn"));
            waitForSeconds(3);
            click(By.xpath("//span[normalize-space()='Cerrar y cancelar pago']"));
        }
        //crear el else para cerrar el camino correcto
    }
    public void completarFormularioMercadoPagoDosTarjetas(){
        WebElement iframe = findElement(By.tagName("iframe"));
        switchToFrame(iframe);
        // Aceptar cookies si es necesario
        if (elementExists(By.xpath("//button[text()='Aceptar cookies']")) ) {
            click(By.xpath("//button[text()='Aceptar cookies']"));
        }
        click(dosTarjetasMP);
// Aceptar cookies nuevamente si es necesario
        if (elementExists(By.xpath("//*[contains(text(),'Aceptar cookies')]")) ) {
            click(By.xpath("//*[contains(text(),'Aceptar cookies')]"));
        }
        waitForSeconds(2);
        writeText(numeroTarjetaUnoMP, "4509953566233704");
        waitForSeconds(2);
        writeText(nombreTitularUnoMP, "APRO");
        click(mesVencimientoUnoMP);
        waitForSeconds(2);
        click(noviembreMP);
        waitForSeconds(2);
        click(anoVencimientoUnoMP);
        waitForSeconds(2);
        click(veinticincoAnoMP);
        waitForSeconds(2);
        writeText(codSeguridadUnoMP, "123");
        writeText(documentoUnoMP,"11111111");

        click(By.xpath("//button[@aria-label='Cuotas: Elegí']"));
        click(By.xpath("//li[@name='[1]']"));
        click(btnContinuarMP);

        // Verificar si aparecen mensajes de error
        if (elementExists(By.xpath("(//*[normalize-space()='Algo salió mal...'])[1]")) ||
                elementExists(By.xpath("(//*[normalize-space()='No pudimos procesar tu pago'])[1]"))){
            // Realizar acciones en caso de error
            System.out.println("Algo salio mal...\nNo pudimos procesar tu pago\n");
            click(By.id("mp-close-btn"));
            waitForSeconds(3);
            click(By.xpath("//span[normalize-space()='Cerrar y cancelar pago']"));
        }
        //crear el else para cerrar el camino correcto
    }
}