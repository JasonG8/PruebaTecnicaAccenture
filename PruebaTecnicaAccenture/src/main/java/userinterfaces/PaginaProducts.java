package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProducts {

    public static final Target buttonAddToCartProduct = Target.the("Boton agregar a carro de compras")
            .located(By.xpath("//a[text()='Add to cart']"));

    private PaginaProducts() {
    }
}
