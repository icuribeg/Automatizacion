package co.com.choucair.certification.proyectolatam.stepdefinitions;

import co.com.choucair.certification.proyectolatam.questions.Answer;
import co.com.choucair.certification.proyectolatam.tasks.OpenUp;
import co.com.choucair.certification.proyectolatam.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class LatamStepDefintions {

    @Before
    public void setStage (){

        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que Isabel quiere validar el código de la reserva Latam$")
    public void queIsabelQuiereValidarElCódigoDeLaReservaLatam()  {
        OnStage.theActorCalled("Isabel").wasAbleTo(OpenUp.thePage());

    }

    @Cuando("^ella busque el código de la reserva VBCDGG$")
    public void ellaBusqueElCódigoDeLaReservaVBCDGG()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the());

    }

    @Entonces("^ella verifica que el código de la reserva sea de (.*) digitos$")
    public void ellaVerificaQueElCódigoDeLaReservaSeaDeDigitos(Integer question ) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));



    }

}
