package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.PaginaCart.*;



public class LlenarDatos implements Interaction {


    public static LlenarDatos elFormulario() {
        return instrumented(LlenarDatos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(paginaCart, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(paginaCart),
                WaitUntil.the(buttonPlaceOrder, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(buttonPlaceOrder),
                Enter.theValue("Jason").into(inputName),
                Enter.theValue("Colombia").into(inputCountry),
                Enter.theValue("Medellin").into(inputCity),
                Enter.theValue("12345").into(inputCreditCard),
                Enter.theValue("Agosto").into(inputMonth),
                Enter.theValue("2022").into(inputYear),
                WaitUntil.the(buttonPurchase, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(buttonPurchase),
                WaitUntil.the(questionCompra, isPresent()).forNoMoreThan(60).seconds()
        );
    }
}