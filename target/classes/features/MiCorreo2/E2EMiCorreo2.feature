@MiCorreo2
Feature: Mis envios


Scenario Outline: Nuevo envío individual

  Given el usuario "<tipoUsuario>" se situa en los campos email y password
    And el usuario realiza un envio "<tipoDeEnvio>"
    And el usuario seleciona el tipo de "<tipoDeEntrega>"
    And el usuario valida que se encuentre pagado el envio

  Examples:
    | tipoUsuario      | tipoDeEnvio   | tipoDeEntrega  | medioPago        |
    | Consumidor final |  individual    | sucursal       | Tarjeta          |




