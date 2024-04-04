package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utils.Generalidades;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.PaginaHome.*;
import static utils.ConstantManage.PASSWORD;
import static utils.ConstantManage.USER;

public class RegistrarNuevoUsuario implements Task {
    public static RegistrarNuevoUsuario demoBlaze() {
        return Tasks.instrumented(RegistrarNuevoUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(botonSignUp, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(botonSignUp),
                Enter.theValue(USER).into(inputUsername),
                Enter.theValue(PASSWORD).into(inputPassword),
                Click.on(buttonSignIN)
        );

        Generalidades.tiempoEsperaCorto();

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

    }
}