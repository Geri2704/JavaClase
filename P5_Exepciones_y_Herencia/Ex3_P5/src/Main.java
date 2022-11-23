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