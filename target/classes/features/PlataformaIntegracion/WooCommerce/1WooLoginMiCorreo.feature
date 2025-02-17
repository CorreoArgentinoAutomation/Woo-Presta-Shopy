@PPDIPI-3221
@Woocommerce
@CasosMiCorreo
Feature: Validar configuracion de servicios en WordPress

  Scenario Outline: Configuracion de servicio Mi Correo en WordPress
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
  And ingreso el usuario y la contrasena con el "<tipoUsuario>"
  And completo los datos del negocio en el formulario
  Then valido que se guarden los a justes
    Examples:
      | tipoUsuario      |
      | Consumidor final |
      #| Monotributista   |
      #| Empresa          |