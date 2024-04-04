package hooks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static utils.ConstantManage.URL;

public class AbrirWeb implements Task {

    private EnvironmentVariables enviromentVariables;

    public AbrirWeb(String webUrl) {
        this.webUrl = webUrl;
    }

    private String webUrl;


    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathWebUrl = EnvironmentSpecificConfiguration.from(enviromentVariables).getProperty(URL);
        actor.attemptsTo(Open.url(pathWebUrl));
    }
    public static Performable browserUrl(String webUrl){
        return instrumented(AbrirWeb.class, webUrl);
    }

}

