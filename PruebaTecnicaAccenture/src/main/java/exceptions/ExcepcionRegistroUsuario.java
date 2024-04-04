package exceptions;

public class ExcepcionRegistroUsuario extends AssertionError{

    public ExcepcionRegistroUsuario(String message, Throwable cause) {
        super(message, cause);
    }
}
