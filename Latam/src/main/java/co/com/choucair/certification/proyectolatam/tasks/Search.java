package co.com.choucair.certification.proyectolatam.tasks;

import co.com.choucair.certification.proyectolatam.userinterface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Search implements Task {


    public static Search the() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchPage.BUTTON_MISVIAJES),
                Click.on(SearchPage.BUTTON_INGRESAR),
                Click.on(SearchPage.SELECT_DONDE_ENCONTRARLOS),
                Click.on(SearchPage.SELECT_NRO_ORDEN),
                Click.on(SearchPage.SELECT_COD_RESERVA)

        );


    }
}
