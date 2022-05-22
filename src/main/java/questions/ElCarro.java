package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebMilEscarrentalPagar;

public class ElCarro implements Question<Boolean> {

    String pregunta;
    public ElCarro(String pregunta){

        this.pregunta=pregunta;
    }

    public static ElCarro SeEscogioConEl(String pregunta){

        return new ElCarro(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String respuesta;
        respuesta= Text.of(ElementosWebMilEscarrentalPagar.BOOTONPAGAR).viewedBy(actor).asString();
        if(respuesta.equals(pregunta)){
            return true;
        }else
        {
            return false;
        }
    }
}
