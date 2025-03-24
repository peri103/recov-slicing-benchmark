import java.util.WeakHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new WeakHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        int a = 1234 * 4321;
        int b = a % 5;
        if (b == 0) {
            map.put(3, "Three");
        } else {
            map.remove(3);
            if (b % 2 == 0) {
                map.put(4, "Four");
            }
        }
        map.put(5, "Five");
        map.remove(5);
        /* write */ map.put(6, "Six");
        if (b > 2) {
            map.put(7, "Seven");
        } else {
            map.remove(1);
            map.put(1, "OneUpdated");
        }
        map.put(8, "Eight");
        String temp = map.get(2);
        map.remove(8);
        if (b < 3) {
            map.put(9, "Nine");
            map.remove(9);
        }
        /* read */ String ret = map.containsKey(6) ? map.get(6) : "Default";
        System.out.println(ret); 
    }
}