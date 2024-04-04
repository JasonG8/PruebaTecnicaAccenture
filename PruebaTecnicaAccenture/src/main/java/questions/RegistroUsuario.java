package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.PaginaHome.questionRegistro;


public class RegistroUsuario implements Question <String> {
    public static RegistroUsuario exitososo() {
        return new RegistroUsuario();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(questionRegistro,isVisible()).forNoMoreThan(60).seconds());
        return Text.of(questionRegistro).answeredBy(actor);
    }
}