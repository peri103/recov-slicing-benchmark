import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "Value" + i);
        }
        Random random = new Random();
        int trigger = random.nextInt(100);
        int[] misleadingArray = {10, 20, 30};
        misleadingArray[0] = misleadingArray[0] + random.nextInt(50);
        map.put(10, "Confuse");
        if (trigger > 50) {
            map.put(11, "Dummy");
        }
        if (trigger < 75) {
            /* write */ map.put(5, "SpecialKey");
        } else {
            map.put(5, "AnotherValue");
        }
        map.replace(2, "Altered");
        map.get(8);
        /* read */ String ret = map.get(5);
        System.out.println("Retrieved Value: " + ret);
    }
}