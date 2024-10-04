@PPDIPI-3416
@CancelacionDePedido
@Presta
Feature: Flujo de cancelacion de pedido

  Scenario Outline: Reiniciar, configurar el Plugin de Mi Correo, completar el formulario de la tienda, importar pedidos y pagar los pedidos imprimiendo la etiqueta
    Given  el usuario ha iniciado sesion en el dashboard de Presta
    When  el usuario navega al menu de los modulos
    And el usuario reinicia la configuracion del Plugin de Mi Correo
    And  el usuario ingresa a la configuracion del plugin
    And  el usuario se loguea en Api Mi Correo con los "<tipoUsuario>"
    And  el usuario llena el formulario de la tienda
    And que estoy en la pagina de inicio de la tienda
    And selecciono un producto
    And agrego el producto al carrito
    And procedo a pagar el producto del carrito
    And continuo con el proceso de checkout seleccionando el tipo de envio1
    And capturo la referencia del pedido
    And cancelo el pedido en el dashboard de PrestaShop
    Examples:
      | tipoUsuario      |
      | Consumidor final |
      | Monotributista   |
      | Empresa          |