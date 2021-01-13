package co.com.choucair.certification.proyectolatam.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.proyectolatam.userinterface.SearchPage.NAME_RESERVA;

public class Answer implements Question<Boolean> {

    private Integer question;

    public Answer (Integer question){

        this.question = question;
    }

    public static Answer toThe(Integer question) {
        return  new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;

        String namereserva = NAME_RESERVA.resolveFor(actor).getText();
        int parte = namereserva.substring(39, 45).length();

        if (question.equals(parte)){
            result = true;
        }else{
            result = false;
        }
        return  result;
    }
}
