import java.util.LinkedList;

public class Stack <T>{
    private T t; //creo T de tipo generico para usarlo en los metodos

    public Stack(T t) {
        this.t = t;
    } //Constructor
    public static <T> boolean isEmpty(LinkedList<T> list){
        return list.isEmpty();
    } //metodo para comprobar si la lista esta vacia
    public static <T> T removeFirst(LinkedList<T> list){
        return list.removeFirst();
    } //metodo para eliminar el primer elemento de la lista
    public static <T> T getFirst(LinkedList<T> list){
        return list.getFirst();
    } //metodo para obtener el primer elemento de la lista
    public static <T> void add(LinkedList<T> list, T element){
        list.add(element);
    } //metodo para añadir un elemento a la lista
    public static <T> String toString(LinkedList<T> list){
        return list.toString();
    } //metodo para convertir la lista en un String y asi poder imprimirlo

}
