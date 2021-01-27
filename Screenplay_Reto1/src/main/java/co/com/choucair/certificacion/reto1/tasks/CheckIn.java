package co.com.choucair.certificacion.reto1.tasks;

import co.com.choucair.certificacion.reto1.userinterface.CheckInPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectOptions;

public class CheckIn implements Task {

    private  String nombre;
    private String apellido;
    private String direccion;

    public CheckIn (String nombre, String apellido, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion =direccion;
    }

    public static CheckIn the(String nombre, String apellido, String direccion) {
        return Tasks.instrumented(CheckIn.class, nombre, apellido, direccion);
    }





    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(nombre).into(CheckInPage.PRIMERNOMBRE),
                Enter.theValue(apellido).into(CheckInPage.APELLIDO),
                Enter.theValue(direccion).into(CheckInPage.DIRECCION),
                SelectFromOptions.byVisibleText("APIs").from(CheckInPage.HABILIDADES)

        );

    }
}
