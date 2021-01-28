package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.CheckInPage;
import co.com.choucair.certification.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class CheckIn implements Task {

    private List<List<String>> data;


    public CheckIn(List<List<String>> data){

        this.data = data;
    }


    public static CheckIn the(List<List<String>> data) {

        return Tasks.instrumented(CheckIn.class, data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on( CheckInPage.BUTTON_REGISTRO ),
                Enter.theValue(data.get(0).get(0).trim()).into(CheckInPage.FIRST_NAME),
                Enter.theValue(data.get(0).get(1).trim()).into(CheckInPage.LAST_NAME),
                Enter.theValue(data.get(0).get(2).trim()).into(CheckInPage.EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).get(3).trim()).from(CheckInPage.BIRTH_MES),
                SelectFromOptions.byVisibleText(data.get(0).get(4).trim()).from(CheckInPage.BIRTH_DIA),
                SelectFromOptions.byVisibleText(data.get(0).get(5).trim()).from(CheckInPage.BIRTH_AÑO),
                Click.on( CheckInPage.SPOKEN ),
                Enter.theValue(data.get(0).get(6).trim()).into(CheckInPage.SELECT_SPOKEN).thenHit( Keys.ENTER),
                Click.on( CheckInPage.CONTINUAR ),
                Click.on( CheckInPage.CITY ),
                Click.on( CheckInPage.CONTINUAR1),
                Click.on( CheckInPage.COMPUTER ),
                Enter.theValue(data.get(0).get(7).trim()).into(CheckInPage.SELECT_COMPUTER).thenHit( Keys.ENTER),
                Click.on( CheckInPage.VERSION ),
                Enter.theValue(data.get(0).get(8).trim()).into(CheckInPage.SELECT_VERSION).thenHit( Keys.ENTER),
                Click.on( CheckInPage.LANGUAGE ),
                Enter.theValue(data.get(0).get(9).trim()).into(CheckInPage.SELECT_LANGUAGE).thenHit( Keys.ENTER),
                Click.on( CheckInPage.MOBILE ),
                Enter.theValue(data.get(0).get(10).trim()).into(CheckInPage.SELECT_MOBILE).thenHit( Keys.ENTER),
                Click.on( CheckInPage.MODEL ),
                Enter.theValue(data.get(0).get(11).trim()).into(CheckInPage.SELECT_MODEL).thenHit( Keys.ENTER),
                Click.on( CheckInPage.SYSTEM ),
                Enter.theValue(data.get(0).get(12).trim()).into(CheckInPage.SELECT_SYSTEM).thenHit( Keys.ENTER),
                Click.on( CheckInPage.CONTINUAR1 ),
                Enter.theValue(data.get(0).get(13).trim()).into(CheckInPage.PASS),
                Enter.theValue(data.get(0).get(14).trim()).into(CheckInPage.CONF_PASS),
                Click.on( CheckInPage.CHECK_TERMINOS ),
                Click.on( CheckInPage.CHECK_POLITICA ),
                Click.on( CheckInPage.TERMINAR)

        );



    }
}
