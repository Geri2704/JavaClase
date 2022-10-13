import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> skins = new ArrayList<String>();
        skins.add("Vandal Reaver");
        skins.add("Vandal Forsaken");
        skins.add("Vandal GLUGLU");
        skins.add("Vandal SentinelsOfLight");
        skins.add("Vandal Gaia");
        skins.add("Vandal Prime");
        Iterator<String> it = skins.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}