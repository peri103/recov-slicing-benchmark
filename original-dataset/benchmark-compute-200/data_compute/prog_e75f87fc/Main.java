import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        int pseudoRandom = 5432;
        boolean condition = (pseudoRandom % 2 == 0);
        map.put(4, "Four");
        if (!condition) {
            map.put(1, "Uno");
        }
        if (condition) {
            /* write */ map.put(2, "TwoAndAHalf");
        }
        map.remove(3);
        map.put(pseudoRandom, "Random");
        String value = "";
        for (int i = 0; i < 5; i++) {
            if (map.containsKey(i)) {
                value += map.get(i);
            }
        }
        map.get(5);
        map.get(-1);
        /* read */ String ret = map.get(2);
        System.out.println(ret); 
    }
}
