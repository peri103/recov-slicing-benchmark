import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        /* other operations */
        int initialValue = 100, misleadingValue = 200;
        map.put("initial", initialValue);
        map.put("misleading", misleadingValue);
        /* other operations */
        String keyToRead = "correctKey", altKey = "altKey";
        map.put(keyToRead, 42);
        /* misleading computations */
        for (int i = 0; i < 5; i++) {
            map.put("loopKey" + i, i * i);
        }
        if (keyToRead.length() < 10) { 
            if (initialValue < misleadingValue) {
                /* write */ map.put("correctKey", 123);
            }
        } else {
            map.put("fallback", 789);
        }
        /* other operations */
        map.remove("initial");
        map.put("dummy", 555);
        map.put(altKey, map.get("misleading") * 3);
        if (map.containsKey("dummy")) {
            map.replace("dummy", 111);
        }
        /* read */ int ret = map.get("correctKey");
        System.out.println("Value at read point: " + ret);
    }
}
