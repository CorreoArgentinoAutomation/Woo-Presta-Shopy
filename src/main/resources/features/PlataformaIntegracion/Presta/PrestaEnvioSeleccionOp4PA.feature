@PPDIPI-3425
@EnvioOpcion4PaqAr
@Presta
Feature: Flujo de pago de pedido

  Scenario: Reiniciar, configurar el Plugin de Mi Correo y completar el formulario de la tienda
    Given  el usuario ha iniciado sesion en el dashboard de Presta
    When  el usuario navega al menu de los modulos
    And el usuario reinicia la configuracion del Plugin de Mi Correo
    And  el usuario ingresa a la configuracion del plugin
    And  el usuario se loguea en Api Paq Ar
    And  el usuario llena el formulario de la tienda
    And que estoy en la pagina de inicio de la tienda
    And selecciono un producto
    And agrego el producto al carrito
    And procedo a pagar el producto del carrito
    And continuo con el proceso de checkout seleccionando el tipo de envio4
    And capturo la referencia del pedido
    And preimpongo el pedido en el dashboard de PrestaShop
