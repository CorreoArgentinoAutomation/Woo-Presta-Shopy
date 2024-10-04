@PPDIPI-3414
@CrearCuenta
@Presta
Feature: Crear cuenta de Api Mi Correo

  Scenario Outline: Reiniciar, configurar el Plugin de Mi Correo y completar el formulario de la tienda
    Given  el usuario ha iniciado sesion en el dashboard de Presta
    When  el usuario navega al menu de los modulos
    And el usuario reinicia la configuracion del Plugin de Mi Correo
    And  el usuario ingresa a la configuracion del plugin
    And  el usuario crea una cuenta en Api Mi Correo con el "<tipoUsuario>"
    Then  el usuario deberia ver un mensaje de confirmacion de login
    Examples:
      | tipoUsuario      |
      | Consumidor final |
      | Monotributista   |
      | Empresa          |