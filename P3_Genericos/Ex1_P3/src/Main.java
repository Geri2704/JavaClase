import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //LISTA 1 CON STRING
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Hello");
        lista.add("!");
        System.out.println(Stack.getFirst(lista));
        if (Stack.isEmpty(lista)){
            System.out.println("Lista is empty");
        }else{
            System.out.println("Lista is not empty");
        }
        Stack.removeFirst(lista);
        System.out.println(Stack.getFirst(lista));
        Stack.add(lista, "World");
        System.out.println(Stack.toString(lista));

        //SEPARADOR PARA SEPARAR LAS LISTAS
        System.out.println("____________________________________________");

        //PRUEBA LISTA 2 CON ENTEROS
        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.add(1);
        lista2.add(2);
        System.out.println(Stack.getFirst(lista2));
        if (Stack.isEmpty(lista2)){
            System.out.println("Lista is empty");
        }else{
            System.out.println("Lista is not empty");
        }
        Stack.removeFirst(lista2);
        System.out.println(Stack.getFirst(lista2));
        Stack.add(lista2, 3);
        System.out.println(Stack.toString(lista2));
    }
}