# Autor : iuribe@choucairtesting.com.co
# language:es

@historia
Característica: Automatizacion de la pagina utest.com
  yo como usuario, quiero realizar el registro en la página utest.com
  a traves del diligenciamiento del formulario

  @escenario1
  Esquema del escenario: Realizar el registro en la pagina utest.com
    Dado que Isabel quiere acceder a la Web utest.com
    Cuando ella realiza el registro en la página
    |<first_name>|<last_name>|<email>|<birth_mes>|<birth_dia>|<birth_año>|<spoken>|<computer>|<version>|<language>|<mobile>|<model>|<system>|<pass>|<Conf_pass>|

    Entonces ella verifica que el registro sea exitoso Welcome to the world's largest community of freelance software testers!

    Ejemplos:
      |first_name|last_name|email|birth_mes|birth_dia|birth_año|spoken|computer|version|language|mobile|model|system|pass|Conf_pass|
      |Isabel    |Uribe    |icuribe1@gmail.com|June|2 |1990     |Spanish|Windows|10     |Spanish |Apple |iPhone 7|iOS13.3|*Isabel2Uribe|*Isabel2Uribe|