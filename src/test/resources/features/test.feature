Feature: Test de automatizacion

  @test01
  Scenario: primer test de automatizacion (Ejemplo automatizando en google)
    Given abro el navegador
    When navego en google "www.google.cl"
    And ingreso los datos para sumar "2+2"
    And busco el resultado
    Then valido que el resultado sea correcto"4"