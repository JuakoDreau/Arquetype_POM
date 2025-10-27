Feature: Test de automatizacion

  @test01
  Scenario: primer test de automatizacion (Ejemplo automatizando en google)
    Given abro el navegador
    When navego en google "www.google.cl"
    And ingreso los datos para sumar "2+2"
    And busco el resultado
    Then valido que el resultado sea correcto"4"

  @test02
  Scenario: Login about any page
    Given open the browser
    When set the url page "www.google.com"
    And set username "2+2"
    And press search buttom
    Then Validate the result "4"

  @test03
  Scenario: Seleccion fruta
    Given navego en la pagina "https://designsystem.digital.gov/components/combo-box"
    And selecciono el combobox
    Then selecciono la fruta "Apple"