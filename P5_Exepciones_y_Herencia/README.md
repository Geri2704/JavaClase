# README

### Explicacion del codigo
La explicación del codigo esta hecha dentro de cada ejercicio con comentarios.

### Ejercicio 2: ¿Qué tiene de especial la excepción del tipo “RuntimeException”?

La clase RuntimeException representa las excepciones que ocurren durante el tiempo de ejecución. Se usa igual que las otras exepciones aunque no hace falta especificar que puede ser lanzada, que al contrario de las excepciones tipo checked, daran un error de compilación si no lo haces.

### Ejercicio 3: Escribe un código que genere y capture una excepción al sobrepasar el límite de un array. Añada el código a la tabla

```java 
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5]; //definimos un array con 5 espacios
        try {
            array[0] = 1; //primer espacio dentro del array
            array[1] = 1; //segundo espacio dentro del array
            array[2] = 10; //tercer espacio dentro del array
            array[3] = 8; //cuarto espacio dentro del array
            array[4] = 3; //quinto espacio dentro del array
            array[5] = 5; //sexto espacio *NO CABE EN EL ARRAY*
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage()); /*Si algun numero no cabe en los espacios del array
            nos devuelve un error diciendo que el valor no cabe en el array*/
        }
    }
}
```

### Ejercicio 4: Crea un programa con un bucle while que pida al usuario un número entero y muestre el resultado del cuadrado. En caso de introducir un carácter o valor que no sea un número, captura la excepción y vuelva a pedirle el número hasta que sea correcto. Añada el código a la tabla

```java 
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
```