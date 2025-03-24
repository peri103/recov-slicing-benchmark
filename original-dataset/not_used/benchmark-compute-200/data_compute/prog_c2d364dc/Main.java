import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        int x = (int) (Math.random() * 100);
        int y = x % 5;
        map.remove(2);
        map.put(4, "Four");
        map.put(5, "Five");
        if (y < 2) {
            map.put(6, "Six");
        }
        map.remove(4);
        map.put(7, "Seven");
        /* write */ map.put(2, "Two Updated");
        map.put(8, "Eight");
        y += 3;
        if (y >= 3) {
            /* read */ String ret = map.get(2);
            System.out.println("Retrieved: " + ret);
        } else {
            System.out.println("Condition not met.");
        }
    }
}
