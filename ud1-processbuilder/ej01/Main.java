import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            int codigoSalida = new ProcessBuilder("echo", "Hola")
                    .inheritIO()
                    .start()
                    .waitFor();

            if (codigoSalida == 0) {
                System.out.println("Resultado: Bien");
            }

        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
