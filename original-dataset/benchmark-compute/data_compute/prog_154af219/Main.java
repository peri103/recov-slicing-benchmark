import java.util.Map;
import java.util.WeakHashMap;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new WeakHashMap<>();

        String key1 = new String("key1");
        String key2 = new String("key2");
        map.put(key1, 10);
        map.put(key2, 20);

        int rand = 1234 * 4321 + 777 + 888 + 999;

        int control = rand % 4;

        map.put("misleading", 0);

        if (control % 2 == 0) {
            map.put("indirect", 40);
        }

        /* write */String chosenKey = (control % 2 == 0) ? "key1" : "key2";

        /* read */int ret = map.get(chosenKey);
        System.out.println("Retrieved value: " + ret);
    }
}