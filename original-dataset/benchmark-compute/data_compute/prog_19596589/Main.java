import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 1000);
        map.put(2, 2000);
        map.put(3, 3000);
        int rand = (int) (Math.random() * 100);
        if (rand % 2 == 0) {
            map.put(4, 4000);
        } else {
            map.put(5, 5000);
        }
        map.put(6, 6000);
        if (rand % 3 == 0) {
            /* write */ map.put(2, 2100);
        } else {
            map.put(3, 3100);
        }
        map.put(7, 7000);
        map.remove(5);
        map.put(8, 8000);
        /* read */ int ret = map.get(2);
        System.out.println("Value retrieved: " + ret);
    }
}
