import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hs.add((int) (Math.random() * 100));
        }
        System.out.println("Valores aleatorios sin ordenar");
        hs.forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("Valores aleatorios ordenados");
        hs.stream().sorted().forEach((s) -> {
            System.out.println(s);
        });
    }
}