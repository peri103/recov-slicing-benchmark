import java.util.WeakHashMap;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        String key1 = new String("key1");
        String key2 = new String("key3");
        String key3 = new String("key2");
        map.put(key1, 100);
        map.put(key2, 200);
        /* write */map.put(key3, 300);
        int unrelatedCalc = key1.length() * key2.length();
        double randomFactor = Math.random() * 1000;
        unrelatedCalc += (int)randomFactor;
        Random rand = new Random();
        if (rand.nextInt(10) > 5) {
            map.put(key3, 300);
        }
        if (unrelatedCalc % 2 == 1) {
            map.remove(key3);
        }
        map.put(key2, 400);
        map.put("key4", 500);
        map.replace(key1, 101);
        /* read */int ret = map.get("key2");
        System.out.println("Retrieved value: " + ret);
    }
}