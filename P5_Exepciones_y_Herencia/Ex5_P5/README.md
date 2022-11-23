# Crea un programa que pida 4 valores numericos y los repita. El programa tiene que controlar que los valores escritos por el usuario sean numeros y, si no lo son, envia el codigo de error y vuelve a pedir el valor.

## Solucion

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, z = 0, k = 0;
        boolean repetir;
        do {
            repetir = false;
            try {
                System.out.print("Introduce primer número entero: ");
                x = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido " + e);
                sc.nextLine();
                repetir = true;
            }
        } while (repetir);
        do {
            repetir = false;
            try {
                System.out.print("Introduce segundo número entero: ");
                y = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido " + e);
                sc.nextLine();
                repetir = true;
            }
        } while (repetir);
        do {
            repetir = false;
            try {
                System.out.print("Introduce tercer número entero: ");
                z = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido " + e);
                sc.nextLine();
                repetir = true;
            }
        } while (repetir);
        do {
            repetir = false;
            try {
                System.out.print("Introduce cuarto número entero: ");
                k = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido " + e);
                sc.nextLine();
                repetir = true;
            }
        } while (repetir);
        System.out.println("int introducido -> " + x);
        System.out.println("int introducido -> " + y);
        System.out.println("int introducido -> " + z);
        System.out.println("int introducido -> " + k);
    }
}
```