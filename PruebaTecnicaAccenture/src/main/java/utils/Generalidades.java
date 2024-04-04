package utils;

public class Generalidades {

    public static void tiempoEsperamin() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void tiempoEsperaCorto() {
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void tiempoEsperaLargo() {
        try {
            Thread.sleep(6000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
