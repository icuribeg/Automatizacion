package co.com.choucair.certificacion.reto1.stepdefinitions;

import co.com.choucair.certificacion.reto1.tasks.CheckIn;
import co.com.choucair.certificacion.reto1.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DemoSiteStepDefintions {

    @Before
    public void setStage (){

        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que Carlos quiere acceder a la Web Automation Demo Site$")
    public void queCarlosQuiereAccederALaWebAutomationDemoSite()  {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thepage());

    }

    @When("^el realiza el registro en la página (.*),(.*),(.*)$")
    public void elRealizaElRegistroEnLaPáginaIsabelUribe(String nombre, String apellido, String direccion) {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckIn.the(nombre, apellido, direccion));


    }

    @Entonces("^el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row$")
    public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow()  {

    }
}
