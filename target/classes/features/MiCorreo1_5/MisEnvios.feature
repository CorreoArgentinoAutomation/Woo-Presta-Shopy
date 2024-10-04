@OUTLINE
Feature: Mis envios

  Background:
    Given el usuario se situa en los campos email y password

Scenario Outline: Nuevo envío individual

  Given el usuario '<tipoUsuario>' está logueado y en la page home
  When ingresa en nuevo envío individual
  And llena los campos de paquete
  And selecciona el '<tipoEntrega>' completa el formulario de destino
  And selecciona el '<tipoProducto>' y procede a pagar
  And se muestra la grilla de checkout
  Then realiza el pago con '<medioPago>' del envío
  And se confirma que el pago se ha realizado con éxito

  Examples:
| tipoUsuario      | tipoEntrega   | tipoProducto  | medioPago        |
| Consumidor final |  Domicilio    | Clasico       | Tarjeta          |
| Monotributista   |  Sucursal     | Expreso       | Saldo            |
| Empresa          |  Domicilio    | Clasico       | Cuenta Corriente |