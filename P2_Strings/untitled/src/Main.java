import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu el teu nom complet: ");
        String nomComplet = sc.nextLine();
        String Cognoms = nomComplet.substring(primerEspai(nomComplet));
        System.out.println(Cognoms + ", " + nomComplet.charAt(0));

    }
    public static int primerEspai(String nomComplet){
        int espai = 0;
        for (int i=0; i<nomComplet.length(); i++){
            if(nomComplet.charAt(i)==' '){
                espai=i; break;
            }
        }
        return espai;
    }
}