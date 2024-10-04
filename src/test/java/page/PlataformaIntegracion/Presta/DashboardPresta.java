package page.PlataformaIntegracion.Presta;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPresta extends BasePage {
    public DashboardPresta(WebDriver driver) {
        super(driver);
    }

    //======================================================================================
    //Login
    //======================================================================================
    private By txtEmailLogin = By.xpath("//*[@id='email']");
    private By txtPassLogin = By.xpath("//*[@id='passwd']");
    private By btnIniciarSesion = By.xpath("//*[@id='submit_login']");
    //======================================================================================
    //Activar desactivar el plugin
    //======================================================================================
    private By btnMenuModulos = By.xpath("//*[@id='subtab-AdminParentModulesSf']");
    private By btnADMModulos =By.xpath("//*[@id='subtab-AdminModulesSf']/a");
    private By txtTansporteYLogisica = By.xpath("//span[@id='518_modules' and @class='module-search-result-title']");
    private By menuPlugin = By.xpath("(//button[@type='button' and contains(@class, 'btn btn-outline-primary dropdown-toggle dropdown-toggle-split')])[15]");
    private By menuPluginDesactivar = By.xpath("//*[@id='modules-list-container-518']/div/div/div/div[2]/div[4]/div[2]/div/li[1]/form/button");
    private By menuPluginActivar = By.xpath("//button[contains(text(), 'Activar')]");
    private By btnSiDesactivar = By.xpath("//*[@id='modules-list-container-518']/div/div/div/div[2]/div[4]/div[2]/button");
    private By btnActivar = By.xpath("//button[@type='submit' and @class='dropdown-item module_action_menu_enable']");
    private By btnDesactivar = By.xpath("//button[contains(@class, 'module_action_menu_uninstall') and contains(text(), 'Desinstalar')]");
    private By btnTienda = By.xpath("//a[@id='header_shopname']");
    private By btnInstalar = By.xpath("//div[9]//button[@class='btn btn-primary-reverse btn-outline-primary module_action_menu_install']");
    //======================================================================================
    //Activar Configurar el loguin del plugin
    //======================================================================================
    private By btnConfigurar = By.xpath("//div[9]//a[contains(.,'Configurar')]");
    private By apiMiCorreo = By.xpath("//select[@id='CORREOARGENTINO_SERVICE_TYPE']/option[@value='MI_CORREO']");
    private By apiPaqAr = By.xpath("//select[@id='CORREOARGENTINO_SERVICE_TYPE']/option[@value='PAQ_AR']");
    private By btnCotizador = By.xpath("//input[@id='CORREOARGENTINO_USE_RATES_on']");
    private By btnGuardar = By.xpath("//button[@id='module_form_submit_btn']");
    //Login Mi Correo
    private By campoUserName = By.xpath("//input[@id='CORREOARGENTINO_USERNAME_MICORREO']");
    private By campoPassWord = By.xpath("//input[@id='CORREOARGENTINO_PASSWORD_MICORREO']");
    //======================================================================================
    //Activar Configurar el loguin del plugin PaqAr
    //======================================================================================
    private By campoAcuerdo = By.xpath("//input[@id='CORREOARGENTINO_AGREEMENT']");
    private By campoClaveApi = By.xpath("//textarea[@id='CORREOARGENTINO_API_KEY']");
    //======================================================================================
    //Llenar el formulario
    //======================================================================================
    private By campoNombreComercial = By.xpath("//input[@id='CORREOARGENTINO_BUSINESS_NAME']");
    private By campoEmail = By.xpath("//input[@id='CORREOARGENTINO_EMAIL']");
    private By campoCiudad = By.xpath("//input[@id='CORREOARGENTINO_CITYNAME']");
    private By campoCalle = By.xpath("//input[@id='CORREOARGENTINO_STREET_NAME']");
    private By campoAltura = By.xpath("//input[@id='CORREOARGENTINO_STREET_NUMBER']");
    private By campoCodigoPostal = By.xpath("//input[@id='CORREOARGENTINO_ZIP_CODE']");
    private By btnGuardar2 = By.xpath("//button[@name='submitCorreoargentinoModuleAddress']");
    private By validacionLoguin = By.xpath("//div[@class='alert alert-success']");
    //======================================================================================
    //Crear Cuenta
    //======================================================================================
    private By btnCrearCuenta = By.xpath("//a[.='Crear una ahora']");
    private By listaTipoDocumnto = By.xpath("//select[@id='CORREOARGENTINO_DOCUMENT_TYPE']");
    private By opcionDNI = By.xpath("//select[@id='CORREOARGENTINO_DOCUMENT_TYPE']");
    private By opcionCUIT = By.xpath("//select[@id='CORREOARGENTINO_DOCUMENT_TYPE']/option[@value='CUIT']");
    private By campoNumeroDeDocumento = By.xpath("//input[@id='CORREOARGENTINO_DOCUMENT_ID']");
    private By campoNombre = By.xpath("//input[@id='CORREOARGENTINO_FIRST_NAME']");
    private By campoApellido = By.xpath("//input[@id='CORREOARGENTINO_LAST_NAME']");
    private By campoContrasena = By.xpath("//input[@id='CORREOARGENTINO_PASSWORD_MICORREO']");
    private By campoCodigoDeAreCelular = By.xpath("//input[@id='CORREOARGENTINO_AREA_CODE_CELL_PHONE']");
    private By campoCelular = By.xpath("//input[@id='CORREOARGENTINO_CELL_PHONE_NUMBER']");
    private By nombreComercial = By.xpath("//input[@id='CORREOARGENTINO_BUSINESS_NAME']");
    private By btnguardar3 = By.xpath("//button[@name='submitCorreoargentinoModuleAddress']");
    //======================================================================================
    //Importar Pedido
    //======================================================================================
    private By pedidos = By.xpath("//li[@id='subtab-AdminOrders']/a[contains(.,'Pedidos')]");
    private By referenciaPedido = By.xpath("//input[@id='order_reference']");
    private By btnLupa = By.xpath("//i[.='zoom_in']");
    private By btnImportar = By.xpath("//div[@class='d-inline-block ml-2']//a[contains(.,'Importar')]");
    private By btnPreImponer = By.xpath("//a[contains(.,'Preimponer')]");
    private By listaPedidos = By.xpath("//span[contains(.,'Pedidos')]");
    private By menuLateral = By.xpath("//ul[@class='main-menu']");
    private By numeroPedido = By.xpath("//td[@class=' column-id_order fixed-width-xs text-center']");
    //======================================================================================
    //Cancelar Pedido
    //======================================================================================
    private By btnActualizarEstado = By.xpath("//button[@class='btn btn-primary update-status mt-3 mt-md-0 ml-0 ml-md-3']");
    private By opcionCancelar = By.xpath("//li[.='Cancelado']");
    private By validarMensaje = By.xpath("//p[.='Actualizado correctamente']");
    private By listaOpciones = By.xpath("//span[@class='select2 select2-container select2-container--bootstrap select2-container--below select2-container--focus']//span[@class='select2-selection__arrow']");
    private By checkPedido = By.xpath("//td[@class='bulk_action-type column-orders_bulk']/div[@class='md-checkbox']");
    private By ListaAcciones = By.xpath("//button[@class='btn btn-outline-secondary dropdown-toggle js-bulk-actions-btn']");
    private By btnAcualizarEstado = By.xpath("//button[@class='btn btn-primary btn-lg js-submit-modal-form-btn']");
    private By validacionCancelacion = By.xpath("//p[.='Actualizado correctamente']");
    //======================================================================================
    //Login
    //======================================================================================
    private By validacionNegativa = By.xpath("//div[@class='alert alert-warning' and @role='alert'][contains(text(), 'Se han encontrado los siguientes errores') and contains(., 'Username and Password are required')]");
    private By camposrequeridos = By.xpath("//div[@class='alert alert-warning' and @role='alert']//ul/li");
    //private By  = By.xpath("");
    //======================================================================================
    //Metodos
    //======================================================================================

    //login
    public void login() {
        String email = "admin@integracionesco.shop";
        String password = "SzU$H$%W7p";
        writeText(txtEmailLogin, email);
        writeText(txtPassLogin, password);
        click(btnIniciarSesion);
    }

    //Menu Plugins
    public void menuModulos(){
        waitForSeconds(1);
        click(btnMenuModulos);
        waitForSeconds(2);
        click(btnADMModulos);
        waitForSeconds(2);
        scrollPageUpDown(0,3);
    }
    //activar y Desactivar el puglin
    public void activarDesactivarplugin(){
        waitForSeconds(2);
        compararTextoConMensajeEsperado(txtTansporteYLogisica,"Transporte y Logística");
        click(menuPlugin);
        click(menuPluginDesactivar);
        waitForSeconds(2);

        sendTab(6);
        sendEnter();

        //clickWithRetry(btnSiDesactivar);
        waitForSeconds(2);
        click(menuPlugin);
        click(menuPluginActivar);
        waitForSeconds(10);
    }

    public void desintalarEInstalarPlugin(){
        waitForSeconds(2);
        compararTextoConMensajeEsperado(txtTansporteYLogisica,"Transporte y Logística");
        click(menuPlugin);
        waitForSeconds(2);

        sendTab(4);
        sendEnter();

        waitForSeconds(2);

        sendTab(4);
        sendEnter();

        waitForSeconds(2);
        click(btnInstalar);
        waitForSeconds(10);
    }

    //boton Configurar del plugin
    public void hacerClicEnConfigurar(){
        click(btnConfigurar);
    }

    public void opcionMiCorreo(){
        click(apiMiCorreo);
        click(btnCotizador);
        click(btnGuardar);

    }
    public void opcionAPIMiCorreo(){
        opcionMiCorreo();

        String email = "Automationpi@yopmail.com";
        String password = "123123";
        click(campoUserName);
        writeText(campoUserName, email);
        click(campoPassWord);
        writeText(campoPassWord, password);

        click(btnGuardar);

    }
    public void opcionAPIPaqAr(){
        click(apiPaqAr);
        click(btnGuardar);

        String acuerdo = "18018";
        String claveAPI = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJQcnVlYmFzIFRJQVJHIChObyB0b2NhcikiLCJDTEFJTV9UT0tFTiI6IlBFUk1JU1NJT05fREVGQVVMVCIsImlhdCI6MTcxMjYwNzAyNCwiaXNzIjoiSVNTVUVSIn0.qE28CKfSGj63iWOS_AUxGhjtTvVYpvTbRyuePj1Heuo";
        click(campoAcuerdo);
        writeText(campoAcuerdo, acuerdo);
        click(campoClaveApi);
        writeText(campoClaveApi, claveAPI);
        click(btnGuardar);
    }

    public void llenarFormularioTienda(){

        waitForSeconds(2);
        click(campoNombreComercial);
        writeText(campoNombreComercial, "Correo");

        click(campoEmail);
        writeText(campoEmail, "prueba@algo.com");

        click(campoCiudad);
        writeText(campoCiudad, "Chacabuco");

        click(campoCalle);
        writeText(campoCalle, "Soberania Nacional");

        click(campoAltura);
        writeText(campoAltura, "123");

        click(campoCodigoPostal);
        writeText(campoCodigoPostal, "6740");
        scrollPageUpDown(0,2);

        waitForSeconds(2);
        click(btnGuardar2);

    }

    public void validarLoginPaqAr() {
        compararTextoConMensajeEsperado(validacionLoguin, "La información fue actualizada correctamente");
    }


    //Crear cuenta
    public void ingresarACrearCuenta(){
        click(btnCrearCuenta);
    }

    public void llenarCamposObligatorios(String tipoUsuario){

        opcionMiCorreo();
        ingresarACrearCuenta();
            switch (tipoUsuario){
                case "Consumidor final":
                    documentoDNI();
                    camposObligatorios();
                    break;
                case "Monotributista":
                    documentoCUIT();
                    camposObligatorios();
                    break;
                case "Empresa":
                    documentoCUITEmpresa();
                    camposObligatorios();
                    break;
                case "vacio":
                    sinDNI();
                    break;
                default:
                    System.out.println("No Esta definido ese usuario: " + tipoUsuario + "no existe");
            }
    }
    public void documentoDNI(){
        click(opcionDNI);
        sendFlechaArriba(1);
        sendEnter();
        click(campoNumeroDeDocumento);
        writeText(campoNumeroDeDocumento, "12345678");
    }
    public void documentoCUIT(){
        click(opcionCUIT);
        click(campoNumeroDeDocumento);
        writeText(campoNumeroDeDocumento, "20364374667");
    }
    public void documentoCUITEmpresa(){
        click(opcionCUIT);
        click(campoNumeroDeDocumento);
        writeText(campoNumeroDeDocumento, "30710358555");
    }
    public void sinDNI(){
        click(opcionDNI);
        sendFlechaArriba(1);
        sendEnter();
        //click(campoNumeroDeDocumento);
        //writeText(campoNumeroDeDocumento, "");
        click(btnguardar3);
    }
    public void camposObligatorios(){
        //click(campoNumeroDeDocumento);
        //writeText(campoNumeroDeDocumento, "20364374667");

        click(campoNombre);
        writeText(campoNombre, "Correo");

        click(campoApellido);
        writeText(campoApellido, "prueba");

        String email = generadorCorreos();
        click(campoEmail);
        writeText(campoEmail, email);
        System.out.println("" + email);
        scrollPageUpDown(0,1);

        //click(campoContrasena);
        sendTab(1);
        writeText(campoContrasena, "ddsad31a");

        waitForSeconds(1);
        //click(campoCalle);
        writeText(campoCalle, "Calle");


        //click(campoAltura);
        writeText(campoAltura, "123");
        scrollPageUpDown(0,1);

        //click(campoCiudad);
        writeText(campoCiudad, "Mar De Plata");

        //click(campoCodigoPostal);
        writeText(campoCodigoPostal, "1900");
        scrollPageUpDown(0,1);

        //click(campoCodigoDeAreCelular);
        writeText(campoCodigoDeAreCelular, "123");

        //click(campoCelular);
        writeText(campoCelular, "12345678");

        click(btnGuardar);

        click(nombreComercial);
        writeText(nombreComercial, "prueba");
        //scrollPageUpDown(0,2);

        click(btnguardar3);
    }



    //Seleccionar tipo de usuario
    public void seleccionoUsuario(String tipoUsuario) {

    opcionMiCorreo();
    switch (tipoUsuario){
            case "Consumidor final":
                consumirFinalLogin();
                break;
            case "Monotributista":
                monotributoLogin();
                break;
            case "Empresa":
                empresaLogin();
                break;
            case "vacio":
                vacio();
                break;
            default:
                System.out.println("No Esta definido ese usuario: " + tipoUsuario + "no existe");
        }
    }
    public void consumirFinalLogin() {
        click(campoUserName);
        writeText(campoUserName, "Automationpi@yopmail.com");
        waitForSeconds(1);
        click(campoPassWord);
        writeText(campoPassWord, "123123");
        click(btnGuardar);
    }
    public void monotributoLogin() {
        click(campoUserName);
        writeText(campoUserName, "mono_tester@yopmail.com");
        waitForSeconds(1);
        click(campoPassWord);
        writeText(campoPassWord, "123123");
        click(btnGuardar);
    }
    public void empresaLogin() {
        click(campoUserName);
        writeText(campoUserName, "empctacte_test@yopmail.com");
        waitForSeconds(1);
        click(campoPassWord);
        writeText(campoPassWord, "123123");
        click(btnGuardar);
    }

    public void vacio() {
        waitForSeconds(2);
        click(btnGuardar);
    }

    //Envios
    public String importarPedido(String pedido){
        String urlNuevoAmbiente = "https://integracionesco.shop/pra/admin123";
        abrirNuevaPestanaYNavegarA(urlNuevoAmbiente);

        sendTab(9);
        sendEnter();
        sendTab(1);
        sendEnter();


        click(referenciaPedido);
        writeText(referenciaPedido, pedido);

        sendEnter();
        click(btnLupa);

        click(btnImportar);

        String numeroOrden = extraerNumeros(numeroPedido);
        System.out.println("el numero de orden es: " + numeroOrden);

        //validacion del mensaje de preimposicion
        String textComparar = numeroOrden + ": Orden importada";
        compararTextoConMensajeEsperado(validacionLoguin, textComparar);
        System.out.println(textComparar);

        return(numeroOrden);

    }


    public void PreImponerPedido(String pedido){
        String urlNuevoAmbiente = "https://integracionesco.shop/pra/admin123";
        abrirNuevaPestanaYNavegarA(urlNuevoAmbiente);

        sendTab(9);
        sendEnter();
        sendTab(1);
        sendEnter();


        click(referenciaPedido);
        writeText(referenciaPedido, pedido);

        sendEnter();
        click(btnLupa);

        click(btnPreImponer);

        String numeroOrden = extraerNumeros(numeroPedido);
        System.out.println("el numero de orden es: " + numeroOrden);

        //validacion del mensaje de preimposicion
        String textComparar = numeroOrden + ": Orden preimpuesta";
        compararTextoConMensajeEsperado(validacionLoguin, textComparar);
        System.out.println(textComparar);

    }

    public void cancelarPedido(String pedido){
        String urlNuevoAmbiente = "https://integracionesco.shop/pra/admin123";
        abrirNuevaPestanaYNavegarA(urlNuevoAmbiente);

        sendTab(9);
        sendEnter();
        sendTab(1);
        sendEnter();

        click(referenciaPedido);
        writeText(referenciaPedido, pedido);

        sendEnter();

        click(checkPedido);
        click(ListaAcciones);

        sendTab(1);
        sendEnter();

        click(btnAcualizarEstado);

        //validacion del mensaje de preimposicion
        String textComparar = "Actualizado correctamente";
        compararTextoConMensajeEsperado(validarMensaje, textComparar);
        System.out.println(textComparar);



    }

    public void validacionNegativa() {
        compararTextoConMensajeEsperado(validacionNegativa, "La información fue actualizada correctamente");
    }

    public void validarCamposRequeridos() {
        String texto = getText(camposrequeridos);
        System.out.println(""+texto);
        validarCampoExistente(camposrequeridos);

    }

}
