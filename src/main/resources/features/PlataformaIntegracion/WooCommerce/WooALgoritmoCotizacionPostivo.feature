@ALgoritmoCotizacionPostivo
Feature: Agrego productos de diferentes tamaños para cotizar en el algoritmo

  Scenario Outline: Agrego productos para validar el algoritmo de cotizacion
  Given configuro el plugin de mi correo con el "<tipoUsuario>"
   #And selecciono el paquete que quiera "<Paquete>"
   And selecciono el "<Paquete>" que quiero
   #And Agrego los productos al carrito segun el "<Paquete>"
   #And valido mensaje de error en el producto
   #And valido las medidas del "<Paquete>" con el "<tipoUsuario>"
    Examples:
      | tipoUsuario      | Paquete   |
      | Consumidor final | paquete6  |

    # Listado de todos los paquetes
    #  | tipoUsuario      | Paquete   |#Caso Positvo
    #  | Consumidor final | paquete1  |#Caso Positvo
    #  | Consumidor final | paquete2  |#Caso Positvo
    #  | Consumidor final | paquete3  |#Caso Positvo
    #  | Consumidor final | paquete4  |#Caso Positvo
    #  | Consumidor final | paquete5  |#Caso Positvo
    #  | Consumidor final | paquete6  |#Caso Positvo
    #  | Consumidor final | paquete7  |#Caso Positvo
    #  | Consumidor final | paquete8  |#Caso Positvo
    #  | Consumidor final | paquete9  |#Caso Positvo
    #  | Consumidor final | paquete10 |#Caso Positvo
    #  | Consumidor final | paquete11 |#Caso Negativo: Exceso en las medidas (200cm en un solo lado o 300cm en la suma de todos)
    #  | Consumidor final | paquete12 |#Caso Negativo: Exceso en el peso (50kg max)




