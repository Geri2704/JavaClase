import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        buscarLetra();
    }

    private static void buscarLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su numero de DNI: ");
        int dni = sc.nextInt();
        int resto = dni%23;
        System.out.println("Su letra es: " + letras[resto]);
    }
}