Feature: Buscar En Google con datos por parametro
  Daniel quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: buscar en google
    Given Daniel esta en el sitio de google
    When el busca la frase compuesta
      | cadenauno | cadenados    |
      | <palabra> | <palabrados> |
    Then el verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra          | palabrados | resultadoEsperado    |
      | switch           | uno        | switch uno           |
      | sophos solutions | dos        | sophos solutions dos |
      | hola             | tres       | kjadshkjashdkjhaskjd |
