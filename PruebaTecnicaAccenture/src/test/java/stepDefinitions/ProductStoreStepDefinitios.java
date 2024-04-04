package stepDefinitions;


import exceptions.ExcepcionCompra;
import exceptions.ExcepcionInicioDeSesion;
import exceptions.ExcepcionRegistroUsuario;
import hooks.AbrirWeb;
import interactions.ElegirCategoriaYProducto;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.Compra;
import questions.InicioSesion;
import questions.RegistroUsuario;
import tasks.IniciarSesion;
import tasks.RealizarCompra;
import tasks.RegistrarNuevoUsuario;

import static exceptions.Excepcion.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.ConstantManage.*;


public class ProductStoreStepDefinitios {

    @Before
    public void SetUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que ingreso a la pagina ProductStore")
    public void queIngresoALaPaginaDemoBlaze(){
        OnStage.theActorCalled(ACTOR).attemptsTo(
                AbrirWeb.browserUrl(URL)
        );
    }

    @Cuando("realizo un nuevo registro de usuario")
    public void realizoUnNuevoRegistroDeUsuario() {
        theActorInTheSpotlight().attemptsTo(RegistrarNuevoUsuario.demoBlaze());
    }

    @Entonces("me registro exitosamente")
    public void meRegistroExitosamente() {
        theActorInTheSpotlight().should(seeThat(RegistroUsuario.exitososo(), Matchers.comparesEqualTo("PRODUCT STORE"))
                .orComplainWith(ExcepcionRegistroUsuario.class, noseRegistro.getMensaje()));
    }

    @Entonces("Inicio sesion con mi usuario y clave en la pagina Product Store")
    public void inicioSesionEnLaPaginaProductStore() {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.sauceDemo());
    }

    @Entonces("Inicio sesion exitosamente")
    public void inicioSesionExitosamente() {
        theActorInTheSpotlight().should(seeThat(InicioSesion.correcto(), Matchers.comparesEqualTo("Welcome " + USER))
                .orComplainWith(ExcepcionInicioDeSesion.class, noInicioSesion.getMensaje()));
    }
    @Cuando("selecciono la {string} y el {string}")
    public void seleccionoLaCategoriaYElProducto(String Categoria, String Producto) {
        theActorInTheSpotlight().attemptsTo(ElegirCategoriaYProducto.deLaTienda(Categoria,Producto));

    }
    @Cuando("realizo el proceso de compra")
    public void realizoElProcesoDeCompra() {
        theActorInTheSpotlight().attemptsTo(RealizarCompra.exitosamente());

    }
    @Entonces("realizo la compra exitoasmente")
    public void realizoLaCompraExitoasmente() {
        theActorInTheSpotlight().should(seeThat(Compra.exitosa(), Matchers.comparesEqualTo("Thank you for your purchase!"))
                .orComplainWith(ExcepcionCompra.class, noSeRealizoCompra.getMensaje()));

    }

}
