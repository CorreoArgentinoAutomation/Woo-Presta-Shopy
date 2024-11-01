@PPDIPI-3222
@Woocommerce
@CasosPaqAr
Feature: Validar configuracion de servicios en WordPress

  Scenario: Configuracion de servicio Mi Correo en WordPress
    Given que estoy en el Dashboard de WordPress
    And hago clic en el boton de plugin
    And desactivo el plugin
    And Activo el plugin
    Then ver solo 2 opciones Correo Argentino y Conexion Api
    When hago clic en el boton Conexion Api
    And hago clic en el menu desplegable de Servicio
    And selecciono el servicio PaqAr
    And hago clic en el boton Guardar Cambios
    And Ingresar el Acuerdo y Clave API
    And completo los datos del negocio en el formulario
    Then valido que se guarden los a justes