package co.com.choucair.certification.reto5.tasks;


import co.com.choucair.certification.reto5.userinterface.CheckInPage;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
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
                Enter.theValue(data.get(0).get(0).trim()).into(CheckInPage.NOMBRE),
                Enter.theValue(data.get(0).get( 1 ).trim()).into(CheckInPage.APELLIDO),
                Enter.theValue(data.get(0).get( 2 ).trim()).into(CheckInPage.CORREO),
                SelectFromOptions.byVisibleText(data.get(0).get(3).trim()).from(CheckInPage.FECHA_MES),
                SelectFromOptions.byVisibleText(data.get(0).get(4).trim()).from(CheckInPage.FECHA_DIA),
                SelectFromOptions.byVisibleText(data.get(0).get(5).trim()).from(CheckInPage.FECHA_ANO),
                Click.on(CheckInPage.SPOKEN ),
                Enter.theValue(data.get(0).get(6).trim()).into(CheckInPage.SELECT_SPOKEN).thenHit( Keys.ENTER),
                Click.on(CheckInPage.SIGUIENTE1),
                Click.on(CheckInPage.SIGUIENTE2),
                Click.on(CheckInPage.LIST_COMPUTER),
                Enter.theValue(data.get(0).get(7).trim()).into(CheckInPage.SELECT_LIST_COMPUTER).thenHit( Keys.ENTER),
                Click.on(CheckInPage.VERSION),
                Enter.theValue(data.get(0).get(8).trim()).into(CheckInPage.SELECT_VERSION).thenHit( Keys.ENTER),
                Click.on(CheckInPage.lENGUAGE),
                Enter.theValue(data.get(0).get(9).trim()).into(CheckInPage.SELECT_LEGUAGE).thenHit( Keys.ENTER),
                Click.on(CheckInPage.MOVIL),
                Enter.theValue(data.get(0).get(10).trim()).into(CheckInPage.SELECT_MOVIL).thenHit( Keys.ENTER),
                Click.on(CheckInPage.MODEL),
                Enter.theValue(data.get(0).get(11).trim()).into(CheckInPage.SELECT_MODEL).thenHit( Keys.ENTER),
                Click.on(CheckInPage.SYSTEM),
                Enter.theValue(data.get(0).get(12).trim()).into(CheckInPage.SELECT_SYSTEM).thenHit( Keys.ENTER),
                Click.on(CheckInPage.SIGUIENTE3),
                Enter.theValue(data.get(0).get( 13 ).trim()).into(CheckInPage.PASS),
                Enter.theValue(data.get(0).get( 14 ).trim()).into(CheckInPage.CONF_PASS),
                Click.on(CheckInPage.ACEPTAR_TERMINOS),
                Click.on(CheckInPage.ACEPTAR_POLITICAS),
                Click.on(CheckInPage.TERMINAR)

        );


    }
}
