public class Main {

    public static void main(String[] args) {

        try {
            new ProcessBuilder("bash","-lc","top -b -n1").inheritIO().start().waitFor();
        } catch (Exception ex) {
            System.err.println(ex);
        }
            
    }
    
}
