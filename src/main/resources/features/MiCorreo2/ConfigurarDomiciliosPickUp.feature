@MiCorreo2
Feature: Mis envios

  #Background:
    #Given el usuario se situa en los campos email y password

Scenario Outline: Configuracion de datos del usuario

  Given el usuario "<tipoUsuario>" se situa en los campos email y password
    And el usuario se dirige a las configuraciones de la cuenta
    And el usuario configura una Pick Up


  Examples:
    | tipoUsuario      |
    | Consumidor final |
