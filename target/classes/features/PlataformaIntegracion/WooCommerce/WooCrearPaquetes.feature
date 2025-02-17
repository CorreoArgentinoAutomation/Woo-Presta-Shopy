@Crearpaquete
Feature: Anadir nuevo producto

  Scenario Outline: Crear un nuevo producto
  Given que estoy en el Dashboard de WordPress
    #And el usuario crea un producto con "<nombre>","<precio>","<peso>","<longitud>","<ancho>","<alto>"
    And selecciono el paquete que quiera "<Paquete>"
    Examples:
      | Paquete   |
      | paquete10 |
      | paquete7 |
      | paquete8 |
      | paquete5 |
      | paquete4 |
      | paquete3 |


