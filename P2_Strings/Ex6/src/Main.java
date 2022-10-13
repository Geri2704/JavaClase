import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String cadena = "Cadenas de texto y coleccionables";
        int valorASCII;
        for (int i=0; i<cadena.length(); i++) {
            valorASCII = cadena.charAt(i);
            System.out.println("El valor ASCII de la letra " + cadena.charAt(i) + " es: " + valorASCII);
        }
    }
}