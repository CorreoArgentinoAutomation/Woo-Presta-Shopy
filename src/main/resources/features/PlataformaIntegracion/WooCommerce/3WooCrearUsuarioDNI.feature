@PPDIPI-3224
@Woocommerce
Feature: Validar configuracion de servicios en WordPress

  Scenario: Crear un usuario en el plugin
  Given que estoy en el Dashboard de WordPress
    And hago clic en el boton de plugin
    And desactivo el plugin
    And Activo el plugin
    Then ver solo 2 opciones Correo Argentino y Conexion Api
    When hago clic en el boton Conexion Api
    And hago clic en el menu desplegable de Servicio
    And selecciono el servicio Mi Correo
    And hago clic en el menu desplegable Queres usar el cotizador de Correo Argentino
    And selecciono la opcion Si
    And hago clic en el boton Guardar Cambios
    And dar clic en el boton crea una cuenta
    And selecionar la lista
    And seleccionar tipo DNI
    And Lllenar el formulario de cuenta para el plugin
    Then Valido que la cuenta en el plugin se alla creado