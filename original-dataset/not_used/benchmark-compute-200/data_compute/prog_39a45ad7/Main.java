import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(5, "Five");
        map.put(10, "Ten");
        map.put(20, "Twenty");
        int x = 50;
        /* other operations */
        map.put(15, "Fifteen");
        /* intermediate computations */
        int rand = (int)(Math.random() * 100);
        x += rand;
        if (x % 2 == 0) {
            map.put(10, "Ten Revised");
        } else {
            map.put(10, "Ten Original");
        }
        if (rand % 3 == 0) {
            /* write */ map.put(25, "Twenty Five");
        } else {
            map.put(25, "Twenty Five Alternate");
        }
        /* misleading modifications */
        map.put(1, "One");
        map.put(30, "Thirty");
        /* read */ String ret = map.get(25);
        System.out.println("Retrieved: " + ret);
    }
}