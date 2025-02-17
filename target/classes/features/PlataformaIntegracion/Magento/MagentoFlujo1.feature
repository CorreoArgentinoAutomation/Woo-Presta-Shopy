@MagentoFlujo1
Feature: Importar un paquete de productos a Mi Correo

  Scenario Outline: Usuarios de tipo <tipoUsuario> deberian poder importar un paquete de productos a Mi Correo
    Given Inicio sesion en el panel de administracion de Magento
    And el usuario navega hasta la pagina de la tienda
    And el usuario realiza un pedido segun el "<Paquete>" y el "<tipoEnvio>"

    #Given  el usuario ha iniciado sesion en el dashboard de Presta
    #When  el usuario navega al menu de los modulos
    #And el usuario reinicia la configuracion del Plugin de Mi Correo
    #And  el usuario ingresa a la configuracion del plugin
    #And  el usuario crea una cuenta en Api Mi Correo con el "<tipoUsuario>"
    #Then  el usuario deberia ver un mensaje de confirmacion de login
    Examples:
      | tipoUsuario      | Paquete   | tipoEnvio        |
      | Consumidor final | paquete01 | fixed            |
      #| Monotributista   | paquete01 | ClasicoASucursal  |
      #| Monotributista   | paquete01 | ExpressADomicilio |
      #| Empresa          | paquete01 | ExpressASucursal  |
