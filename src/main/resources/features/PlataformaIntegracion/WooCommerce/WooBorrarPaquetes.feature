@BorrarProductos
Feature: Anadir nuevo producto

  Scenario Outline: Crear un nuevo producto
  Given que estoy en el Dashboard de WordPress
    #And el usuario crea un producto con "<nombre>","<precio>","<peso>","<longitud>","<ancho>","<alto>"
    And selecciono el paquete que quiera "<Paquete>"
    #And Borro todos los productos
    Examples:
      | Paquete   |
      | paquete1 |

