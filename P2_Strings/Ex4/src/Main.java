import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = sc.nextLine();
        System.out.println("introduzca la letra que buscar");
        String letra = sc.next();
        int posicion = frase.indexOf(letra);
        while (posicion != -1) {
            System.out.println("La letra " + letra + " se encuentra en la posicion " + posicion);
            posicion = frase.indexOf(letra, posicion + 1);
        }
    }
}