@Google
Feature: ingresar a google
  Background:
    Given El usuario se situa en la pagina de google

    Scenario: Busqueda en google
      When El usuario ingresa a mercado libre
      And Preciona buscar
      Then Aparece el sitio buscado