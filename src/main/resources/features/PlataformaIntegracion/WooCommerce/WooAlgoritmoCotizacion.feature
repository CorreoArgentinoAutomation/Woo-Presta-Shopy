@Crearproducto
Feature: Anadir nuevo producto

  Scenario Outline: Crear un nuevo producto
  Given que estoy en el Dashboard de WordPress
    And el usuario esta en la pagina de productos
    And el usuario hace clic en el boton Anadir nuevo producto
    And el usuario escribe "<nombre>" en el campo de nombre del producto
    And el usuario escribe "<precio>" en el campo de precio
    And el usuario hace clic en el boton Envio
    And el usuario ingresa "<peso>" en el campo de peso
    And el usuario ingresa "<longitud>" en el campo de longitud
    And el usuario ingresa "<ancho>" en el campo de ancho
    And el usuario ingresa "<alto>" en el campo de alto
    And el usuario hace clic en el boton Publicar
    Then el producto deberia ser creado exitosamente

    Examples:
      | nombre   | precio | peso | longitud | ancho | alto |
      | ProdQA1  | 1      | 50   | 100      | 80    | 10   |
      | ProdQA2  | 1      | 1    | 10       | 10    | 10   |
      | ProdQA3  | 1      | 1    | 50       | 20    | 70   |
      | ProdQA4  | 1      | 1    | 70       | 50    | 20   |
      | ProdQA5  | 1      | 1    | 30       | 90    | 70   |
      | ProdQA6  | 1      | 1    | 10       | 75    | 80   |
      | ProdQA7  | 1      | 1    | 50       | 70    | 20   |
      | ProdQA8  | 1      | 1    | 70       | 20    | 50   |
      | ProdQA9  | 1      | 1    | 35       | 45    | 10   |
      | ProdQA10 | 1      | 1    | 35       | 55    | 10   |
      | ProdQA11 | 1      | 1    | 50       | 60    | 10   |
      | ProdQA12 | 1      | 1    | 20       | 40    | 5    |
      | ProdQA13 | 1      | 1    | 10       | 15    | 10   |
      | ProdQA14 | 1      | 1    | 75       | 45    | 10   |
      | ProdQA15 | 1      | 1    | 65       | 55    | 10   |
      | ProdQA16 | 1      | 1    | 100      | 50    | 20   |
      | ProdQA17 | 1      | 1    | 200      | 50    | 35   |
      | ProdQA18 | 1      | 1    | 90       | 30    | 10   |
      | ProdQA19 | 1      | 1    | 20       | 20    | 20   |
      | ProdQA20 | 1      | 51   | 121      | 80    | 10   |
      | ProdQA21 | 1      | 1    | 100      | 120   | 100  |
      | ProdQA22 | 1      | 1    | 201      | 30    | 10   |
