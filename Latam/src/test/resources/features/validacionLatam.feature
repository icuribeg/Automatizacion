# Autor : iuribe@choucairtesting.com.co
# language:es

@historia
Característica: Validacion codigo de reserva Latam
  yo como usuario, quiero validar que el código de la reserva de ejemplo sea de seis dígitos

  @escenario1
  Escenario: validar que el código de la reserva de ejemplo es de seis dígitos
    Dado que Isabel quiere validar el código de la reserva Latam
    Cuando ella busque el código de la reserva VBCDGG
    Entonces ella verifica que el código de la reserva sea de 6 digitos