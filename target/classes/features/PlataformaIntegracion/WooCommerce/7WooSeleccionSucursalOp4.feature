@PPDIPI-3235
@Woocommerce
@CasosMiCorreo
@envios
Feature: Compra de productos en la tienda a través de WordPress y Correo Argentino
  Como usuario de la tienda
  Quiero comprar productos y seleccionar opciones de envío
  Para poder completar mi compra y verificar el número de pedido

  Scenario Outline: Compra exitosa con envío a sucursal y verificación del numero de pedido
    Given configuro el plugin de mi correo con el "<tipoUsuario>"
    And selecciono el "<Paquete>" que quiero
    And ingreso al Ecommerce
    And me dirijo a la tienda que contiene los productos
    When agrego algun producto al carrito y espero que se cargue en el carrito

    And me dirijo al checkout

    #And me dirijo al Carrito
    #And selecciono una opcion de envio que sea a domicilio
    #And hago clic en el boton Finalizar Compra para dirigirme al checkout

    And quito el check del envio alterno
    And selecciono la cuarta opcion de envio y que sea un envio a sucursal
    And selecciono el envio a sucursal
    And escribo en el cuadro de texto de sucursal y selecciono la primera opcion
    And hago clic en el boton de Finalizar pedido y me redirijo al detalle del pedido
    Then capturo los datos del pedido
    And visualizo el numero del pedido
    And pago el pedido en PrestaShop con el "<tipoUsuario>"
    Examples:
      | tipoUsuario      | Paquete  |
      | Consumidor final | paquete2 |
      | Monotributista   | paquete2 |
      | Empresa          | paquete2 |