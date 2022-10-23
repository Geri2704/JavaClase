
public class StackArray <T> {
    private T[] array; //Array de tipo T
    private int size; //crear un contador para saber cuantos elementos hay en el array

    public StackArray() {
        array = (T[]) new Object[10];
        size = 0;
    } //constructor

    public boolean isEmpty() {
        return size == 0;
    } //comprobar si el array esta vacio

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        } //si esta vacio no se puede eliminar nada
        T first = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        } //recorrer el array y mover los elementos una posicion a la izquierda (eliminando el primero)
        size--; //disminuir el contador (porque se ha eliminado un elemento)
        return first; //devolver el elemento eliminado
    }

    public T getFirst() {
        if (isEmpty()) {
            return null;
        } //si esta vacio no se puede devolver nada
        return array[0]; //devolver el primer elemento del array
    }

    public void add (T element) {
        if (size == array.length) { //si el contador es igual al tamaño del array
            T [] newArray = (T[]) new Object[array.length * 2]; //si el array esta lleno, crear un nuevo array con el doble de tamaño
            for (int i = 0; i < size; i++) { //recorrer el array
                newArray[i] = array[i]; //copiar los elementos del array antiguo al nuevo
            }
            array = newArray; //el array antiguo pasa a ser el nuevo (con el doble de tamaño)
        }
        array[size] = element;  //añadir el "elemento" al final del array
        size++; //aumentar el contador (porque se ha añadido un "elemento")
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += array[i] + ", "; //recorrer el array y añadir cada "elemento" al string
        }
        if (result.length() > 1) { //si el string tiene mas de 1 caracter
            result = result.substring(0, result.length() - 2); //eliminar la ultima coma y el espacio (generados por el for)
        }
        return result; //devolver el string para mostrarlo por pantalla
    }


}
