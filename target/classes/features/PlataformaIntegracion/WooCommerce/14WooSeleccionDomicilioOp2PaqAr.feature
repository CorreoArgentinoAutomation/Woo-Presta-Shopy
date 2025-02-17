@PPDIPI-3229
@Woocommerce
@CasosPaqAr
@envios
Feature: Compra de productos en la tienda a través de WordPress y Correo Argentino
  Como usuario de la tienda
  Quiero comprar productos y seleccionar opciones de envío
  Para poder completar mi compra y verificar el número de pedido

  Scenario: Compra exitosa con envío a sucursal y verificación del numero de pedido
    Given configuro el plugin de mi correo con el usuario PaqAr
    And creo un producto
    And ingreso al Ecommerce
    And me dirijo a la tienda que contiene los productos
    When agrego algun producto al carrito y espero que se cargue en el carrito

    #quitar este paso para que el flujo valla por carrito para cotiZar
    #And me dirijo al checkout

    And me dirijo al Carrito
    And calculo el envio
    #And selecciono una opcion de envio que sea a domicilio
    And hago clic en el boton Finalizar Compra para dirigirme al checkout

    #And quito el check del envio alterno
    And selecciono la segunda opcion de envio
    And hago clic en el boton de Finalizar pedido y me redirijo al detalle del pedido
    Then capturo los datos del pedido
    And importo el pedido y lo selecciono
    Then Valido que el cambio de estado del pedido



