# Autor : iuribe@choucairtesting.com.co

@stories
Feature: Validacion de texto en la pantalla despues del registro
  yo como usuario, quiero validar que despues de registrarme en la pantalla siguiente muestre
  este el texto Double Click on Edit Icon to EDIT the Table Row

  @scenario1
    Scenario Outline: validar que pantalla este el texto Double Click on Edit Icon to EDIT the Table Row
    GIVEN que Carlos quiere acceder a la Web Automation Demo Site
    WHEN el realiza el registro en la página
    <nombre><apellido>
    THEN el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row

    Examples:
      | nombre | apellido |
      | isabel | Uribe    |
