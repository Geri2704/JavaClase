import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su nombre completo: ");
        String nomComplet = sc.nextLine();
        String Cognoms = nomComplet.substring(saberEspacio(nomComplet));
        System.out.println(Cognoms.trim() + ", " + nomComplet.charAt(0) + ".");
    }

    public static int saberEspacio(String nomComplet){
        int espacio = 0;
        for(int i=0; i<nomComplet.length(); i++){
            if(nomComplet.charAt(i) == ' '){
                espacio = i;
                break;
            }
        }
        return espacio;
    }
}