package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static utils.ConstantManage.USER;

public class PaginaHome {

    public static final Target botonSignUp = Target.the("Boton de Sign Up")
            .located(By.xpath("//a[@id='signin2']"));

    public static final Target inputUsername = Target.the("Campo de texto User name")
            .located(By.xpath("//input[@id='sign-username']"));

    public static final Target inputPassword = Target.the("Campo de texto Password")
            .located(By.xpath("//input[@id='sign-password']"));

    public static final Target buttonSignIN = Target.the("Boton Sign In")
            .located(By.xpath("//button[text()='Sign up']"));

    public static final Target questionRegistro = Target.the("Validacion Registro de Usuario")
            .located(By.xpath("//a[contains(text(),'PRODUCT STORE')]"));

    public static final Target botonLogIn = Target.the("Boton Log In")
            .located(By.xpath("//a[@id='login2']"));

    public static final Target inputUsernameLogin = Target.the("Campo de texto User name")
            .located(By.xpath("//input[@id='loginusername']"));

    public static final Target inputPasswordLogin = Target.the("Campo de texto User Password")
            .located(By.xpath("//input[@id='loginpassword']"));

    public static final Target buttonLogIn = Target.the("Boton Log In")
            .located(By.xpath("//button[text()='Log in']"));

    public static final Target questionInicioSesion = Target.the("Validacion inicio de Sesion Exitoso")
            .located(By.xpath("//a[text()='Welcome "+USER+"']"));

}
