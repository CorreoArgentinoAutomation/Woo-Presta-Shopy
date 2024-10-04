@crearPedidos
Feature:

  Scenario Outline: Crear pedidos
 # Given Inicio sesion en PrestaShop
  #  Given  el usuario ha iniciado sesion en el dashboard de Presta
  #  When  el usuario navega al menu de los modulos
  #  And el usuario reinicia la configuracion del Plugin de Mi Correo
  #  And  el usuario ingresa a la configuracion del plugin
  #  And  el usuario se loguea en Api Mi Correo con los "<tipoUsuario>"
  #  And  el usuario llena el formulario de la tienda
    And que estoy en la pagina de inicio de la tienda
    And selecciono un producto
    And agrego el producto al carrito
    And procedo a pagar el producto del carrito
    And continuo con el proceso de checkout seleccionando el tipo de envio1
    And capturo la referencia del pedido
    And repetir "<numero>"
    Examples:
      | numero |
      | 1      |
      | 2      |
      | 3      |
      | 4      |
      | 5      |
      | 6      |
      | 7      |
      | 8      |
      | 9      |
      | 10     |
      | 11     |
      | 12     |
      | 13     |
      | 14     |
      | 15     |
      | 16     |
      | 17     |
      | 18     |
      | 19     |
      | 20     |
      | 21     |
      | 22     |
      | 23     |
      | 24     |
      | 25     |
      | 26     |
      | 27     |
      | 28     |
      | 29     |
      | 30     |
      | 31     |
      | 32     |
      | 33     |
      | 34     |
      | 35     |
      | 36     |
      | 37     |
      | 38     |
      | 39     |
      | 40     |
      | 41     |
      | 42     |
      | 43     |
      | 44     |
      | 45     |
      | 46     |
      | 47     |
      | 48     |
      | 49     |
      | 50     |
      | 51     |
      | 52     |
      | 53     |
      | 54     |
      | 55     |
      | 56     |
      | 57     |
      | 58     |
      | 59     |
      | 60     |