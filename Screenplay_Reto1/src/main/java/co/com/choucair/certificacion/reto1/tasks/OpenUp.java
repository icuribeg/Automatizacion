package co.com.choucair.certificacion.reto1.tasks;

import co.com.choucair.certificacion.reto1.userinterface.DemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private DemoSitePage demoSitePage;

    public static OpenUp thepage() {

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(demoSitePage));
    }

}

