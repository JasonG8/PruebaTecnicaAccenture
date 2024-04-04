package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.PaginaHome.*;
import static utils.ConstantManage.PASSWORD;
import static utils.ConstantManage.USER;


public class IniciarSesion implements Task {
    public static IniciarSesion sauceDemo() {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(botonLogIn, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(botonLogIn),
                Enter.theValue(USER).into(inputUsernameLogin),
                Enter.theValue(PASSWORD).into(inputPasswordLogin),
                Click.on(buttonLogIn),
                WaitUntil.the(questionInicioSesion, isPresent()).forNoMoreThan(60).seconds()
        );
    }
}