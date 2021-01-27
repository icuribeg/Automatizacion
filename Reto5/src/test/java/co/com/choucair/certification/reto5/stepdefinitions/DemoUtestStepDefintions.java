package co.com.choucair.certification.reto5.stepdefinitions;

import co.com.choucair.certification.reto5.questions.Answer;
import co.com.choucair.certification.reto5.tasks.CheckIn;
import co.com.choucair.certification.reto5.tasks.OpenUp;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class DemoUtestStepDefintions {


    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Isabel quiere acceder a la Web$")
    public void queIsabelQuiereAccederALaWeb()  {
        OnStage.theActorCalled("Isabel").wasAbleTo( OpenUp.thePage());

    }

    @Cuando("^ella realiza el registro en la página$")
    public void ellaRealizaElRegistroEnLaPágina(DataTable datos)  {
        List<List<String>> data = datos.raw();
        OnStage.theActorInTheSpotlight().attemptsTo(CheckIn.the(data));



    }

    @Entonces("^ella verifica que el registro sea exitoso (.*)$")
    public void ellaVerificaQueElRegistroSeaExitoso(String question) {
        OnStage.theActorInTheSpotlight().should( GivenWhenThen.seeThat( Answer.toThe(question)));



    }
}
