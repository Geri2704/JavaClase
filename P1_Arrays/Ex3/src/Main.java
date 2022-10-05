public class Main {

    public static void main(String[] args) {
        int[][] tabla = new int[4][5];
        int[] sumaFila = new int[4];
        int[] sumaColumna = new int[5];
        int sumaTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = (int) (Math.random() * 10);
                sumaFila[i] += tabla[i][j];
                sumaColumna[j] += tabla[i][j];
                sumaTotal += tabla[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("| " + sumaFila[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(sumaColumna[i] + " ");
        }
        System.out.println("| " + sumaTotal);
    }
    
}