package co.com.choucair.certification.reto5.questions;

import co.com.choucair.certification.reto5.userinterface.CheckInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer (String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
        return  new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameregistro = Text.of( CheckInPage.CONFIR_REGISTRO).viewedBy(actor).asString();
        if (question.equals(nameregistro)){
            result = true;
        }else{
            result = false;
        }
        return  result;
    }
}


