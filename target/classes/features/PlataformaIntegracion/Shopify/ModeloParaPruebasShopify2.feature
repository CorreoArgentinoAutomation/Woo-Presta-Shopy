@Shopify
Feature:

  Scenario: Crear pedidos
  Given Inicio sesion en Shopify
    And Ingreso a la tienda de Shopify
    And agrego el producto al carrito
    And procedo a pagar el producto del carrito
    And continuo con el proceso de checkout seleccionando el tipo de envio1
    And capturo la referencia del pedido