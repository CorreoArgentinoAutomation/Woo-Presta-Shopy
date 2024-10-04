package page.PlataformaIntegracion.Shopify;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardShopify extends BasePage {

    //Creacion de Usuarios
    private By campoEmail = By.xpath("//input[@id='account_email']");
    private By btnContninuarCorreo = By.xpath("//span[@class='ui-button__text']");
    private By campoPass = By.xpath("//input[@id='account_password']");
    private By btnContinuar = By.xpath("//button[@name='commit']");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");


    public DashboardShopify(WebDriver driver) {
        super(driver);
    }

        public void login() {
        System.out.println("inicio de session");
        //writeText(campoEmail, "Rodrigo.Vargas@tsoftglobal.com");
        //waitForSeconds(4);
        //sendEnter();
        //click(btnContinuar);
        //writeText(campoPass, "_mddt9z.yZKWJ2W");
        //waitForSeconds(4);
        //sendEnter();
        //click(btnContinuar);
    }

    public void ingresarALaTienda(){
        String urlNuevoAmbiente = "https://testqc2-correo-argentino.myshopify.com/";
        abrirNuevaPestanaYNavegarA(urlNuevoAmbiente);
    }

    //Pedido
    //1 - Seleccionar el Producto //ul[@class='grid product-grid contains-card contains-card--product contains-card--standard grid--4-col-desktop grid--2-col-tablet-down']//div[@class='card-wrapper product-card-wrapper underline-links-hover']/div[1]/div[@class='card__content']//a[contains(.,'Alfajores Havanna')]
    //2 - Hacer un clic en el boton "Buy it now" //button[@class='shopify-payment-button__button shopify-payment-button__button--unbranded']
    //3 - Llenar el formulario del checkOut
    // campoEmanil //input[@id='email']
    // campoFirstName //div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@name='firstName']
    // campoLastName //div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@name='lastName']
    // campoAdreess //div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@class='_7ozb2uq _7ozb2up _1fragemlj _1fragemss _1fragemod _1fragemrz _7ozb2ur _7ozb2u11 _7ozb2u1h']
    // campoPostalCode //div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@name='postalCode']
    // campoCity //div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@name='city']
    // listaDeProvincias //select[@id='Select1']/option[@value='C']
    // campoNumeroDeTarjeta //select[@name='zone'] //Tiene que ser 1
    // campoExpiracionDeTarjeta //input[@id='expiry'] //tiene que ser una fecha mayor a la actual
    // campoCodigoDeSeguririadaTarjeta //Puede ser cualquiera
    // btnPayNow ////button[@id='checkout-pay-button']

    private By producto = By.xpath("//ul[@class='grid product-grid contains-card contains-card--product contains-card--standard grid--4-col-desktop grid--2-col-tablet-down']//div[@class='card-wrapper product-card-wrapper underline-links-hover']/div[1]/div[@class='card__content']//a[contains(.,'Alfajores Havanna')]");
    private By btnBuyItNow = By.xpath("//button[@class='shopify-payment-button__button shopify-payment-button__button--unbranded']");
    private By campoEmanil = By.xpath("//input[@id='email']");
    private By campoFirstName = By.xpath("//div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@name='firstName']");
    private By campoLastName = By.xpath("//div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@name='lastName']");
    private By campoAdreess = By.xpath("//div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@class='_7ozb2uq _7ozb2up _1fragemlj _1fragemss _1fragemod _1fragemrz _7ozb2ur _7ozb2u11 _7ozb2u1h']");
    private By campoPostalCode = By.xpath("//div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@name='postalCode']");
    private By campoCity = By.xpath("//div[@class='_7ozb2u6 _7ozb2u5 _1fragemlj _1fragem2s _1fragemnl _1fragemse _1fragems9 _1fragemso _1fragemsr _7ozb2uc _7ozb2ua _1fragemnb _1fragemsx _7ozb2ul _7ozb2uh _7ozb2u8']/input[@name='city']");
    private By listaDeProvincias = By.xpath("//select[@id='Select1']/option[@value='C']");
    private By campoNumeroDeTarjeta = By.xpath("//select[@name='zone']");
    private By campoExpiracionDeTarjeta = By.xpath("//input[@id='expiry']");
    private By campoCodigoDeSeguririadaTarjeta = By.xpath("//input[@id='verification_value']");
    //private By  = By.xpath("");
    //private By  = By.xpath("");
    //private By  = By.xpath("");


    public void generarPedido(){

        click(producto);
        click(btnBuyItNow);

        //llenarFormulario
        String email = generadorCorreos();
        writeText(campoEmanil, email);

        String nombre = generadornombres();
        writeText(campoFirstName, nombre);

        String apellido = generadornombres();
        writeText(campoLastName, apellido);

        writeText(campoAdreess, "Calle");

        writeText(campoPostalCode, "1900");



    }
/*
    public void validarSubMenu() {
        validarCampoExistente(SubCorreoArg);
        validarCampoExistente(SubConexionApi);
        validarCampoExistente(SubDatosComerciales);

        // Verifica la existencia del submenu Correo Argentino
        boolean SubmenuSubCorreoArg = validarCampoExistente(SubCorreoArg);
        // Verifica la existencia del submenu ConexionApi
        boolean SubmenuSubConexionApi = validarCampoExistente(SubConexionApi);
        // Verifica la existencia del Submenu Datos Comerciales
        boolean SubmenuSubDatosComerciales = validarCampoExistente(SubDatosComerciales);

        // Imprime mensajes en la consola sobre la existencia de los campos
        if (SubmenuSubCorreoArg && SubmenuSubConexionApi && SubmenuSubDatosComerciales) {
            System.out.println("Los Elementos buscados exiten.");
        } else if (SubmenuSubCorreoArg) {
            System.out.println("El campo de usuario existe, pero el campo de Correo Arg no.");
        } else if (SubmenuSubConexionApi) {
            System.out.println("El campo de contrase�a existe, pero el campo de Conexion APi no.");
        } else if (SubmenuSubDatosComerciales) {
            System.out.println("El campo de contrase�a existe, pero el campo de Datos Comerciales no.");
        } else {
            System.out.println("Los Elementos buscados no exiten.");
        }
    }

    public void ingresarEcommerce() {

        posicionarCursorEnElemento(myWordpressLocator);
        validarCampoExistente(btnVisitarSitio);
        validarCampoExistente(btnVisitarTienda);


        // Verifica la existencia del submenu Visitar Sitio
        boolean SubmenuSitio = validarCampoExistente(btnVisitarSitio);
        // Verifica la existencia del submenu Visitar Tienda
        boolean SubmenuTienda = validarCampoExistente(SubConexionApi);

        // Imprime mensajes en la consola sobre la existencia de los campos
        if (SubmenuSitio && SubmenuTienda) {
            System.out.println("Los Elementos buscados exiten.");
        } else if (SubmenuSitio) {
            System.out.println("El campo de usuario existe, pero el campo de Visitar Sitio no.");
        } else if (SubmenuTienda) {
            System.out.println("El campo de contrase�a existe, pero el campo de Visitar Tienda no.");
        } else {
            System.out.println("Los Elementos buscados no exiten.");
        }

        waitForSeconds(2);
        click(myWordpressLocator);
        System.out.println("Ingreso correcto al Ecommerce");
    }

    public String importarPedido() {
        String Pedido = extraerNumeros(numeroPedido);
        click(myWordpressLocator);
        posicionarCursorEnElemento(lblCorreo);
        waitForSeconds(2);
        click(By.xpath("//a[contains(text(),'Correo Argentino')]"));
        // Generar el XPath dinámico concatenando el número de pedido al XPath deseado
        String xpathPedido = "//input[@value='" + Pedido + "']";
        // Hacer clic en el elemento generado utilizando el XPath dinámico
        click(By.xpath(xpathPedido));
        waitForSeconds(2);
        seleccionarOpcionPorValor(dropdownLocator, "importar");
        waitForSeconds(1);
        click(btnAplicar);
        waitForSeconds(5);
        return Pedido;
    }

    //flujo WooLoginMiCorreo
    //1 - Ingresar al Dashboard de de wordPress
    public void ingresarAWordPres() {
        writeText(usrlocator, "admin");
        writeText(passlocator, "{0n[VK*{+wR?");
        click(btnLogin);
    }

    //2 - Validar que solo alla 2 opciones "Correo Argentino" y "Conexion Api"
    public void validarSubMenuSinLogin() {
        posicionarCursorEnElemento(lblCorreo);
        validarCampoExistente(SubCorreoArg);
        validarCampoExistente(SubConexionApi);

        // Verifica la existencia del submenu Correo Argentino
        boolean SubmenuSubCorreoArg = validarCampoExistente(SubCorreoArg);
        // Verifica la existencia del submenu ConexionApi
        boolean SubmenuSubConexionApi = validarCampoExistente(SubConexionApi);

        // Imprime mensajes en la consola sobre la existencia de los campos
        if (SubmenuSubCorreoArg && SubmenuSubConexionApi) {
            System.out.println("Los Elementos buscados exiten.");
        } else if (SubmenuSubCorreoArg) {
            System.out.println("El campo de Correo Arg no existe.");
        } else if (SubmenuSubConexionApi) {
            System.out.println("El Submenu Correo Argentino exite, pero el campo de Conexion APi no.");
        } else {
            System.out.println("Los Elementos buscados no exiten.");
        }
    }

    //3 - Clic en el boton "Conexion Api"
    public void ingresarAConexionApi() {
        click(SubConexionApi);
    }

    //4 - clic en la lista desplegable Servicio
    public void seleccionarServicio() {
        click(dropdownServicio);
    }

    //5 - seleccionar un servicio Mi Correo
    public void seleccionoMiCorreo() {
        waitForSeconds(2);
        click(servicioMiCorreo);
    }

    public void seleccionoPaqAr() {
        click(servicioPaqAr);
    }

    //6 - clic en la lista desplegable ¿Querés usar el cotizador de Correo Argentino?
    public void seleccionarCotizador() {
        click(dropdownCotizador);
    }

    //7 - Clic en la opcion "Si"
    public void seleccionarOpcionCotizador() {
        waitForSeconds(2);
        click(opcionCotizadorSI);
        //Existe un comportamiento variable en el que se necesitaria llamar estos 2 pasos
        //seleccionarServicio();
        //seleccionoMiCorreo();
    }

    //8 - clic en el boton guardar cambios
    public void guardarCambios() {
        click(btnGuardarCambios);
    }

    //9 - Ingresar el user y pass
    public void seleccionoUsuario(String tipoUsuario) {
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
            default:
                System.out.println("No Esta definido ese usuario: " + tipoUsuario + "no existe");
        }
    }
    public void consumirFinalLogin() {
        click(txtUsuarioEnvio);
        writeText(txtUsuarioEnvio, "Automationpi@yopmail.com");
        waitForSeconds(1);
        click(txtContrasenaEnvio);
        writeText(txtContrasenaEnvio, "123123");
        click(btnGuardarCambios);
    }
    public void monotributoLogin() {
        click(txtUsuarioEnvio);
        writeText(txtUsuarioEnvio, "mono_tester@yopmail.com");
        waitForSeconds(1);
        click(txtContrasenaEnvio);
        writeText(txtContrasenaEnvio, "123123");
        click(btnGuardarCambios);
    }
    public void empresaLogin() {
        click(txtUsuarioEnvio);
        writeText(txtUsuarioEnvio, "empctacte_test@yopmail.com");
        waitForSeconds(1);
        click(txtContrasenaEnvio);
        writeText(txtContrasenaEnvio, "123123");
        click(btnGuardarCambios);
    }


    //10 - Llenar en el formulario los datos de negocio
    public void llenarFormularioDeNegocio() {
        click(campoNombre);
        writeText(campoNombre, "Prueba");
        click(campoEmail);
        //sendBorrar(25);
        writeText(campoEmail, "Automationpi@yopmail.com");
        click(campoCiudad);
        writeText(campoCiudad, "CABA");
        click(campoCalle);
        writeText(campoCalle, "calle");
        click(campoAltura);
        writeText(campoAltura, "12345");
        click(campoCodigoPostal);
        writeText(campoCodigoPostal, "1020");
        click(btnGuardarCambios);
    }

    //11 - Validar mensaje de guardado de ajuste
    public void validarMensajeGuardado() {
        compararTextoConMensajeEsperado(txtAjustesGuardados, "Tus ajustes se han guardado.");
        System.out.println("Tus ajustes se han guardado.");
    }

    //Para generar un pedido rapido
    public void generarPedidoDashboard() {
        login();
        validarSubMenu();
        ingresarEcommerce();
    }

    public String importarPedidoInsumo() {
        String Pedido = extraerNumeros(numeroPedido);
        click(myWordpressLocator);
        waitForSeconds(2);
        click(By.xpath("//a[contains(text(),'Correo Argentino')]"));
        // Generar el XPath dinámico concatenando el número de pedido al XPath deseado
        String xpathPedido = "//input[@value='" + Pedido + "']";
        // Hacer clic en el elemento generado utilizando el XPath dinámico
        click(By.xpath(xpathPedido));
        waitForSeconds(5);
        return Pedido;
    }

    //Funciones para Desactivar y Activar el pluging
    //1 Hacer clic en el boton plugin
    public void irAlMenuPlugin() {
        click(menuPlugin);
    }

    //2 Hacer clic en el boton desactivar
    public void desactivarPlugin() {
        waitForSeconds(2);
        click(btnDesactivarPlugin);
    }

    //3 Hacer clic en el boton activar
    public void activarPlugin() {
        waitForSeconds(2);
        click(btnActivarPlugin);
    }

    public void ingresoDeAcuerdoYClaveAPI() {
        click(txtAcuerdo);
        writeText(txtAcuerdo, "18018");
        waitForSeconds(1);
        click(txtClaveAPI);
        writeText(txtClaveAPI, "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJQcnVlYmFzIFRJQVJHIChObyB0b2NhcikiLCJDTEFJTV9UT0tFTiI6IlBFUk1JU1NJT05fREVGQVVMVCIsImlhdCI6MTcxMjYwNzAyNCwiaXNzIjoiSVNTVUVSIn0.qE28CKfSGj63iWOS_AUxGhjtTvVYpvTbRyuePj1Heuo");
        click(btnGuardarCambios);
    }

    //Funciones para Crear Usuario
    //1 - Seleccionar menu Usuarios
    public void selecionarMenuUsarios() {
        click(btnUsuarios);
    }

    //2 - Hacer un clic en el boton Crear Usuario
    public void crearUsuario() {
        click(btncrearusuario);
    }

    //3 - llenar formulario
    public void llenarFormularioCreacionUsuario() {
        click(campoNombreDeUsuario);
        writeText(campoNombreDeUsuario, generadornombres());
        String email = generadorCorreos();
        click(campoCorreoEletronico);
        writeText(campoCorreoEletronico, email);
        System.out.println("" + email);

        click(listaPerfil);

    }

    //4 - Seleccionar perfil
    public void seleccionarPerfilGestorDeLaTienda() {
        click(perfilGestorDeLaTienda);
    }

    public void seleccionarPerfilCliente() {
        click(perfilCliente);
    }

    public void seleccionarPerfilSuscritor() {
        click(perfilSuscriptor);
    }

    public void seleccionarPerfilColaborador() {
        click(perfilColaborador);
    }

    public void seleccionarPerfilAutor() {
        click(perfilAutor);
    }

    public void seleccionarPerfilEditor() {
        click(perfilEditor);
    }

    public void seleccionarPerfilAdministrador() {
        click(PerfilAdministrador);
    }


    //5 - Hacer un clic en el boton anadir nuevo usuario
    public void hacarClicEnAnadirNuevoUsuario() {
        click(btnAnanirNuevoUsuario);
    }

    //6 - Validar que el usuario se ha creado
    public void validarUsuarioCreado() {
        compararTextoConMensajeEsperado(validacionCreacionUsuario, "Nuevo usuario creado.");
        System.out.println("Nuevo usuario creado.");
    }

    //Crear Cuenta Plugin
    //1 - Dar Clic en el boton Crea una cuenta
    public void darClicEnCreaUnaCuenta() {
        click(btnCrearCuentaPlugin);
    }

    //2 - Seleccionar la lista
    public void seleccionarLista() {
        click(listaTipoDNI);
    }

    //3 - Seleccionar DNI
    public void seleccionarDNI() {
        click(seleccionarTipoDNI);
        click(pluginCampoNumeroDocumento);
        writeText(pluginCampoNumeroDocumento, numerosAleatorios(8));
    }

    //3 - Seleccionar CUIT
    public void seleccionarCUIT() {
        click(seleccionarTipoCUIT);
        click(pluginCampoNumeroDocumento);
        writeText(pluginCampoNumeroDocumento, "30593315157");
    }

    public void llenarFormularioPlugin() {
        //click(pluginCampoNumeroDocumento);
        //writeText(pluginCampoNumeroDocumento,"123456789");
        click(pluginCampoFirstName);
        writeText(pluginCampoFirstName, caracteresAleatorios(8));
        click(pluginCampoLastName);
        writeText(pluginCampoLastName, caracteresAleatorios(8));

        String email = generadorCorreos();
        //String email2 = "empctacte_test@yopmail.com";

        click(pluginCampoEmail);
        writeText(pluginCampoEmail, email);
        System.out.println("" + email);

        waitForSeconds(1);
        scrollPageUpDown(0, 1);
        waitForSeconds(1);

        String pass = "123123";

        click(pluginCampoContrasena);
        writeText(pluginCampoContrasena, pass);
        System.out.println("La conseña del user creado es: " + pass);

        waitForSeconds(1);
        click(pluginCampoCalle);
        writeText(pluginCampoCalle, "calle");
        click(pluginCampoAltura);
        writeText(pluginCampoAltura, "1234");
        click(pluginCampoCiudad);
        writeText(pluginCampoCiudad, "CABA");
        click(pluginCampoProvincia);
        click(pluginCampoCodigoPostal);
        writeText(pluginCampoCodigoPostal, "1020");
        click(pluginCampoCelular);
        writeText(pluginCampoCelular, "12345678");
        click(btnGuardarCambios);

    }

    //Hacer la validacion de que se creo la cuenta
    //5 - Valido que la cuenta en el plugin se alla creado
    public void validarCuentaPlugin() {
        compararTextoConMensajeEsperado(validarCuentapluginmsj1, "Listo, la cuenta ha sido creada");
        compararTextoConMensajeEsperado(validarCuentapluginmsj2, "Tus ajustes se han guardado.");
    }


    //1 - Me Dirijo Al Dashboard
    public void irAlDashboard() {
        click(btnDashboard);
    }

    //2 - Posiciono el mouse arriba del boton de WooCommerce
    public void pocicionarCursorEnWooCommerce() {
        posicionarCursorEnElemento(btnWooCommerce);
    }

    //3 - Hacer clic en Pedido
    public void irAPedidos() {
        click(btnPedidosWooCommerce);
    }

    //4 - Seleccionar la casilla del ultimo pedido realizado
    public void seleccionarPedido() {

    }

    public void cambiarDeEstadoPedidoPaqArCompletado() {
        click(listaEstadosPedidoCompletado);
    }

    public String importarPedidoPaqAr() {
        //paso Previo
        String Pedido = extraerNumeros(numeroPedido);
        //paso 1
        click(myWordpressLocator);
        //paso2
        posicionarCursorEnElemento(btnWooCommerce);
        waitForSeconds(2);
        //paso 3
        click(btnPedidosWooCommerce);
        //click(By.xpath("//a[contains(text(),'Correo Argentino')]"));
        // Generar el XPath dinámico concatenando el número de pedido al XPath deseado
        String xpathPedido = "//input[@value='" + Pedido + "']";
        // Hacer clic en el elemento generado utilizando el XPath dinámico
        click(By.xpath(xpathPedido));
        waitForSeconds(2);

        cambiarDeEstadoPedidoPaqArCompletado();
        //click(listaEstadosPedidoCompletado);
        //seleccionarOpcionPorValor(dropdownLocator, "importar");
        waitForSeconds(1);
        click(btnAplicarPedidosPaqAr);
        waitForSeconds(5);
        return Pedido;
    }

    public void cambiarDeEstadoPedidoPaqArCancelado() {
        click(listaEstadosPedidoCancelado);
    }

    public String importarPedidoPaqArCancelar(){
        //paso Previo
        String Pedido = extraerNumeros(numeroPedido);
        //paso 1
        click(myWordpressLocator);
        //paso2
        posicionarCursorEnElemento(btnWooCommerce);
        waitForSeconds(2);
        //paso 3
        click(btnPedidosWooCommerce);
        //click(By.xpath("//a[contains(text(),'Correo Argentino')]"));
        // Generar el XPath dinámico concatenando el número de pedido al XPath deseado
        String xpathPedido = "//input[@value='" + Pedido + "']";
        // Hacer clic en el elemento generado utilizando el XPath dinámico
        click(By.xpath(xpathPedido));
        waitForSeconds(2);

        cambiarDeEstadoPedidoPaqArCancelado();
        waitForSeconds(1);
        click(btnAplicarPedidosPaqAr);
        waitForSeconds(5);
        return Pedido;
    }


    public void cambiarDeEstadoPedidoPaqArCanceladoMasivo() {
        click(myWordpressLocator);
        posicionarCursorEnElemento(btnWooCommerce);
        waitForSeconds(2);
        click(btnPedidosWooCommerce);
        click(checkTodosLosPedidos);
        waitForSeconds(1);
        cambiarDeEstadoPedidoPaqArCancelado();
        click(btnAplicarPedidosPaqAr);
    }
    public void cambiarDeEstadoPedidoPaqArCompletadoMasivo() {
        click(myWordpressLocator);
        posicionarCursorEnElemento(btnWooCommerce);
        waitForSeconds(2);
        click(btnPedidosWooCommerce);
        click(checkTodosLosPedidos);
        waitForSeconds(1);
        cambiarDeEstadoPedidoPaqArCompletado();
        click(btnAplicarPedidosPaqAr);
    }

    public String importarPedidoPaqArCancelarMasivo(){
        //paso Previo
        String Pedido = extraerNumeros(numeroPedido);
        //paso 1
        click(myWordpressLocator);
        //paso2
        posicionarCursorEnElemento(btnWooCommerce);
        waitForSeconds(2);
        //paso 3
        click(btnPedidosWooCommerce);
        //click(By.xpath("//a[contains(text(),'Correo Argentino')]"));
        // Generar el XPath dinámico concatenando el número de pedido al XPath deseado
        String xpathPedido = "//input[@value='" + Pedido + "']";
        // Hacer clic en el elemento generado utilizando el XPath dinámico
        click(By.xpath(xpathPedido));
        waitForSeconds(2);

        cambiarDeEstadoPedidoPaqArCanceladoMasivo();
        waitForSeconds(1);
        click(btnAplicarPedidosPaqAr);
        waitForSeconds(5);
        return Pedido;
    }


    public void validarCambioDeEstado(){
        compararTextoConMensajeEsperado(validacionCambioDeEstado,"Cambiado el estado de 1 pedido.");
        System.out.println("Cambiado el estado de 1 pedido.");
    }
    public void validarCambioDeMensajeDeConfirmacion(){
        validarCampoExistente(validacionCambioDeEstado);
        System.out.println("Cambio de estado de todos los pedidos");
    }

 */
}
