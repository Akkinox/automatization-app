Feature: Probar la busqueda en Google

Scenario: Busco algo en Google
    Given navego en google
    When Busco algun criterio de busqueda
    And Hago click en el boton de busqueda
    Then Obtengo resultados


