
@tag
Feature: Realizar casos integrando nombre de usuario y contraseña
  
  @tag1
  Scenario: Login y conexion a BD
    Given Abrir Chrome
    When ingresa Username "margarita" y Password "12345"
    Then Iniciar sesion
    When ingresa rut "13092307-K" y nomdueno "Margarita" y apellido "Lopez" y direc "Centenario 1000" 
    When ingresa correo "margarita@gmail" y telefono "81540009"
    When ingresa mascota "Kira" y tipo "Perrita" y edad "10"
    When ingresa fecha "11-01-2024" y hora "17:30"
		Then agendar 