import java.util.Scanner;

public class Main {
    public static void  main(String[]args){
        int nnegativos = 0;
        int npositivos = 0;
        int nceros = 0;
        int[] numeros; numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<numeros.length; i++) {
            System.out.println("Introduzca el numero " + (i+1) + ":");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Datos Guardados:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println(" ");

        for (int i:numeros) {
            if (i>0) npositivos++;
            if (i==0) nceros++;
            if (i<0) nnegativos++;
        }

        System.out.println("Numeros positivos: " + npositivos + "\nNumeros negativos: " + nnegativos + "\nNumeros iguales a cero: " + nceros);
    }
}
