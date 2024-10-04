@OutLine
Feature: Validar configuracion de servicios en WordPress

  Scenario Outline: Configuracion de servicio Mi Correo en WordPress
  Given que estoy en el Dashboard de WordPress
  #And hago clic en el boton de plugin
  #And desactivo el plugin
  #And Activo el plugin
  #Then ver solo 2 opciones Correo Argentino y Conexion Api
  #When hago clic en el boton Conexion Api
  #And hago clic en el menu desplegable de Servicio
  #And selecciono el servicio Mi Correo
  #And hago clic en el menu desplegable Queres usar el cotizador de Correo Argentino
  #And selecciono la opcion Si
  #And hago clic en el boton Guardar Cambios
  #And ingreso el "<tipoUsuario>"
  #And completo los datos del negocio en el formulario
  #Then valido que se guarden los a justes
    And ingreso al Ecommerce
    And me dirijo a la tienda que contiene los productos
    When agrego algun producto al carrito y espero que se cargue en el carrito
    And me dirijo al Carrito
    And selecciono una opcion de envio que sea a domicilio
    And hago clic en el boton Finalizar Compra para dirigirme al checkout
    And quito el check del envio alterno
    And hago clic en el boton de Finalizar pedido y me redirijo al detalle del pedido
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