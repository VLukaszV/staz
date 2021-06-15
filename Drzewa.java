import java.util.*;

public class Drzewa {
    public static void main(String args[]) {

        List<String> drzewa = Arrays.asList("brzoza", "modrzew", "grab", "buk", "wierzba");

        Iterator<String> it = drzewa.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}