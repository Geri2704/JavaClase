import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer nombre: ");
        String nombre1 = sc.next();
        System.out.println("Introduzca el segundo nombre: ");
        String nombre2 = sc.next();
        for(int i=0; i<largo(nombre1, nombre2); i++) {
            if(nombre1.length()>i){
                System.out.print(nombre1.charAt(i));
            }
            if (nombre2.length() > i) {
                System.out.print(nombre2.charAt(i));
            }
        }
    }

    private static int largo(String nombre1, String nombre2) {
        String palabra;
        if(nombre1.length()>nombre2.length()){
            palabra=nombre1;
        }else{
            palabra=nombre2;
        }
        return palabra.length();
    }
}
