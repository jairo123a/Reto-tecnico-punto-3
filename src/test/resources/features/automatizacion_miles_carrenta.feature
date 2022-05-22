Feature: Ingresar al sitio web milescarrenta y realizar el alquiler de un auto
  @regresion

  @caso1
  Scenario: Diligenciar el arriendo de un vehiculo
    Given yo ingreso al sitio web
    When  yo diligencio los campos  y selecciono  el segundo vehiculo
      |localidad                                                |airport              |fecharecogida      |fechadevolucion |nombre           |telefono     |correo            |
      |florida                                                  |Airport Key Marathon |1                  |7               |Juan perez       |301254896    |ms@mailinator.com |
    Then  yo verifico el  vehiculo seleccionado"PAGAR AHORA"