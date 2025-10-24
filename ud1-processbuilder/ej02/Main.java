import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try {
            ProcessBuilder pb = new ProcessBuilder("ls", "-l");
            Process proceso = pb.start();

            InputStream inputStream = proceso.getInputStream();
            InputStreamReader lector_de_flujo = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(lector_de_flujo);

            String linea;
            while ((linea = br.readLine()) !=null) {
                System.out.println(linea);
            }

            int codigo = proceso.waitFor();

            if (codigo == 0) {
                System.out.println("Todo fue bien");
            } else {
                System.err.println("Error");
            }
            br.close();

        } catch(Exception ex){

        }
   }
}