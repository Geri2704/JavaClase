import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = sc.nextLine();
        System.out.println("introduzca la letra que buscar");
        String letra = sc.next();

        for(int i =0; i<frase.length(); i++){
            if(letra.equals(String.valueOf(frase.charAt(i)))){
                System.out.println("La letra aparece en la posicion " + i);
            }
        }
    }
}