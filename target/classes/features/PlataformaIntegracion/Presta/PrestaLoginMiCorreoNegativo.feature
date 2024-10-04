@faltaElId
@negativoDelLogin
@Presta
Feature: Loguin con el Api Mi Correo

  Scenario Outline: Reiniciar, configurar el Plugin de Mi Correo y completar el formulario de la tienda
    Given  el usuario ha iniciado sesion en el dashboard de Presta
    When  el usuario navega al menu de los modulos
    And el usuario reinicia la configuracion del Plugin de Mi Correo
    And  el usuario ingresa a la configuracion del plugin
    And  el usuario se loguea en Api Mi Correo con los "<tipoUsuario>"
    Then  el usuario deberia ver un mensaje de error de login
    Examples:
      | tipoUsuario      |
      | vacio            |
