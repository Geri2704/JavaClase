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
        String[] skinsArray = skins. toArray(new String[0]);
        for (int i = 0; i < skinsArray.length; i++) {
            System.out.println(skinsArray[i]);
        }
    }
}