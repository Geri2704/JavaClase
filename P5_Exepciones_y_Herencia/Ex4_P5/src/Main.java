import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Boolean numero = true; //creamos un booleano para controlar el bucle do while
        System.out.println("Introduzca un numero: "); //pedimos al usuario que introduzca un numero
        /*(lo pongo fuera del bucle do while para que no se repita todo el tiempo ya que al final de este,
           si no se ha escrito un numero, vuelvo a pedir el dato */
        do {
            try {
                Scanner scanner = new Scanner(System.in); //definir nuevo scanner
                int num = scanner.nextInt(); //la variable num coje el valor escrito
                System.out.println("El numero escrito es: " + num); /*si el valor es un numero devuelve este mensaje
                                                                    con el numero que se ha escrito*/
                numero = false; //establece el booleano como false para que salga del bucle
            } catch (Exception e) {
                System.out.println("Valor no valido, por favor itroduzca un numero:"); /*si el valor no es un numero
                devuelve este mensaje de error y te vuelve a pedir el numero*/
            }
        } while (numero); //si el booleano es false se cierra el bucle
        }
    }