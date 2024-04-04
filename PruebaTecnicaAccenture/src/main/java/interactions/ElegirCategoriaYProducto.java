package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import utils.Generalidades;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.PaginaProducts.buttonAddToCartProduct;

public class ElegirCategoriaYProducto implements Interaction {

    public String Categoria;
    public String Producto;

    public ElegirCategoriaYProducto(String Categoria, String Producto) {

        this.Categoria = Categoria;
        this.Producto = Producto;
    }
    public static ElegirCategoriaYProducto deLaTienda(String Categoria, String Producto) {
        return new ElegirCategoriaYProducto(Categoria,Producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Generalidades.tiempoEsperaCorto();

        Target categoria = Target.the(Categoria)
                .located(By.xpath("//*[text()='" + Categoria + "']"));
        WebElementFacade Categorias = categoria.resolveFor(actor);
        Categorias.click();

        Generalidades.tiempoEsperaCorto();

        Target producto = Target.the(Producto)
                .located(By.xpath("//*[text()='" + Producto + "']"));
        WebElementFacade Productos = producto.resolveFor(actor);
        Productos.click();

        Generalidades.tiempoEsperaCorto();

        actor.attemptsTo(
                WaitUntil.the(buttonAddToCartProduct, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(buttonAddToCartProduct));

    }
}
