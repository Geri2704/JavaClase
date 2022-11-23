import java.util.Scanner;

public class ComprobarNumero {
    public static void comprobar(){ //creamos el metodo comprobar
        int num = 0; //iniciamos variable num con valor 0 que nos cojera el valor escrito
        Scanner sc = new Scanner(System.in); //creamos un scanner nuevo
        System.out.println("Introduce un número: "); //pedimos que el usuario introduzca un numero
        num = sc.nextInt(); //la variable num coje el valor escrito mediante el scanner
        if (num < 0) { /*si la variable num es un numero negativo nos dira que el numero es negativo, si no,
                         significa que no es un numero entonces nos devolvera un error*/
            try {
                throw new NegativeNumberException("El número es negativo");
            } catch (NegativeNumberException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
