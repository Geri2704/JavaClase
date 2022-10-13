import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> skins = new ArrayList<String>();
        skins.add("Vandal Reaver");
        skins.add("Vandal Forsaken");
        skins.add("Vandal GLUGLU");
        skins.add("Vandal SentinelsOfLight");
        skins.add("Vandal Gaia");
        skins.add("Vandal Prime");
        skins.forEach((String s) -> System.out.println(s));
    }
}