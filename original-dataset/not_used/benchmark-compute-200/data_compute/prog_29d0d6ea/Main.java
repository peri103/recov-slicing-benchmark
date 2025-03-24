import java.util.Map;
import java.util.WeakHashMap;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new WeakHashMap<>();
        String[] keys = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], i * i);
        }
        map.put("six", 36);
        map.remove("three");
        boolean condition = (keys.length > 4);
        if (condition) {
            /* write */ map.put("target", 42);
        } else {
            map.put("target", 24);
        }
        map.put("seven", 49);
        map.put("eight", 64);
        keys[2] = "updated";
        map.remove("two");
        if (!map.containsKey("nine")) {
            map.put("nine", 81);
        }
        String distractingKey = "six";
        int unrelated = map.get(distractingKey) + 10;
        /* read */ int ret = map.get("target");
        System.out.println("Value read: " + ret);
    }
}