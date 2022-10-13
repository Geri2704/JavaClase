import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una contraseña");
        String contra = sc.next();
        boolean fuerte = false;
        boolean mayusc = false;
        boolean minusc = false;
        boolean simbolo = false;
        boolean numero = false;

        for (int i = 0; i < contra.length(); i++) {
            char c = contra.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusc = true;
            } else if (Character.isLowerCase(c)) {
                minusc = true;
            } else if (Character.isDigit(c)) {
                numero = true;
            } else {
                simbolo = true;
            }
        }
        if (mayusc && minusc && simbolo && numero) {
            fuerte = true;
        }
        if (fuerte) {
            System.out.println("La contraseña es fuerte");
        } else {
            System.out.println("La contraseña es débil");
        }
    }
}