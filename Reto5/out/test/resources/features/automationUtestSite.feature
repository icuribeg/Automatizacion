# Autor : iuribe@choucairtesting.com.co
# language:es

@historia
Característica: Automatizacion de la pagina utest.com
  yo como usuario, quiero realizar el registro en la página utest.com
  a traves del diligenciamiento del fromulario

  @escenario1
  Esquema del escenario: Realizar el registro en la pagina utest.com
    Dado que Isabel quiere acceder a la Web
    Cuando ella realiza el registro en la página
      |<nombre> |  <apellido>|  <correo>|  <fecha_mes> |<fecha_dia>| <fecha_año> |  <idiomas> |<computer> | <version>  | <language>|  <movil>|  <model>|  <system>  |<pass>|  <confirm_pass>|

    Entonces ella verifica que el registro sea exitoso Welcome to the world's largest community of freelance software testers!

  Ejemplos:
      |nombre |  apellido|  correo|  fecha_mes |fecha_dia| fecha_año |  idiomas |  computer | version  | language|movil|  model|  system  |pass|  confirm_pass|
      |Isabel | Uribe    |iuribe@aa.com |June|20|1981   |Spanish   |windows  | 7          |Spanish  |Apple |iPhone 7  |iOS 13    |Isa20belCris*|Isa20belCris*|