@PPDIPI-3831
@ALgoritmoCotizacionNegativo
Feature: Agrego productos de diferentes tamanos para cotizar en el algoritmo

  Scenario Outline: Agrego productos para validar el algoritmo de cotizacion
  Given configuro el plugin de mi correo con el "<tipoUsuario>"
   And selecciono el "<Paquete>" que quiero
   And valido mensaje de error en el "<Paquete>"
    Examples:
      | tipoUsuario      | Paquete   |
      | Consumidor final | paquete11 |
      | Consumidor final | paquete12 |

    # Listado de todos los paquetes
    # =================================
    # Casos postivos
    # =================================
    #  | tipoUsuario      | Paquete   |
    #  | Consumidor final | paquete2  |
    #  | Consumidor final | paquete3  |
    #  | Consumidor final | paquete4  |
    #  | Consumidor final | paquete5  |
    #  | Consumidor final | paquete6  |
    #  | Consumidor final | paquete7  |
    #  | Consumidor final | paquete8  |
    #  | Consumidor final | paquete9  |
    #  | Consumidor final | paquete10 |
    # =================================
    # Casos negativos
    # =================================
    #  | Consumidor final | paquete11 |#Caso Negativo: Exceso en las medidas (200cm en un solo lado o 300cm en la suma de todos)
    #  | Consumidor final | paquete12 |#Caso Negativo: Exceso en el peso (50kg max)


