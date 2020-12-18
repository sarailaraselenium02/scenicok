Feature: Funcionalidad Alta clientes

  Validar que se permita el alta de clientes Persona Fisica

# Scenario Example
  @Login
  Scenario: Alta Clientes Persona Fisica

    Given Ingresa al sistema satisfactoriamente 
    When Usuario Ingresa Seccion Clientes
    And usuario Ingresa datos mínimos de captura 
    And usuario captura datos generales 
    And usuario captura Lugar de nacimiento 
    And usuario captura domicilios 
    And usuario ingresa Telefonos 
    And usuario ingresa ocupacion 
    And usuario ingresa percepcion mensual 
    And usuario ingresa perfil transaccional 
    And Usuario ingresa Declaracion de impuestos 
    And Usuario ingresa Aviso de Privacidad

    Then Captura Folio

   