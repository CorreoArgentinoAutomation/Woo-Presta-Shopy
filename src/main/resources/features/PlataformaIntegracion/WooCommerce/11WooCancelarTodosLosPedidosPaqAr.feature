@PPDIPI-3226
@Woocommerce
@CasosPaqAr
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

    And me dirijo al checkout

    #And me dirijo al Carrito
    #And selecciono una opcion de envio que sea a domicilio
    #And hago clic en el boton Finalizar Compra para dirigirme al checkout

    And quito el check del envio alterno
    And selecciono la segunda opcion de envio
    And hago clic en el boton de Finalizar pedido y me redirijo al detalle del pedido
    Then capturo los datos del pedido
    And selecciono todos los pedidos cambiando el estado a cancelado
    Then Valido que el cambio de estado de todos los pedidos


