package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCart {

    public static final Target paginaCart = Target.the("Boton Pagina Cart")
            .located(By.xpath("//a[text()='Cart']"));

    public static final Target buttonPlaceOrder = Target.the("Boton agregar producto al carro de compras")
            .located(By.xpath("//button[text()='Place Order']"));

    public static final Target inputName = Target.the("Campo de texto para Nombre ")
            .located(By.xpath("//input[@id='name']"));

    public static final Target inputCountry = Target.the("Campo de texto para Pais")
            .located(By.xpath("//input[@id='country']"));

    public static final Target inputCity = Target.the("Campo de texto para Ciudad")
            .located(By.xpath("//input[@id='city']"));

    public static final Target inputCreditCard = Target.the("Campo de texto para Numero Tarjeta")
            .located(By.xpath("//input[@id='card']"));

    public static final Target inputMonth = Target.the("Campo de texto para Mes ")
            .located(By.xpath("//input[@id='month']"));

    public static final Target inputYear = Target.the("Campo de texto para Año ")
            .located(By.xpath("//input[@id='year']"));

    public static final Target buttonPurchase = Target.the("Boton Finalizar compra")
            .located(By.xpath("//button[text()='Purchase']"));

    public static final Target questionCompra = Target.the("Validacion Compra Exitosa ")
            .located(By.xpath("//h2[text()='Thank you for your purchase!']"));

}
