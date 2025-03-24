import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("initial", 0);
        boolean criticalCondition = (5 * 7 % 3 == 1);
        int misleadingVariable = criticalCondition ? 42 : 24;
        /* write */
        if (criticalCondition) {
            map.put("keyToRead", 99);
        } else {
            map.put("keyToWrite", 1);
        }
        map.put("confuser", misleadingVariable);
        for (int i = 0; i < 5; i++) {
            map.put("key" + i, i);
        }
        map.put("dummy", map.getOrDefault("dummy", 57));
        map.remove("nonExistentKey");
        map.computeIfAbsent("key4", k -> map.get("key3") + 1);
        /* read */ int ret = map.get("keyToRead");
        System.out.println("Retrieved value: " + ret);
    }
}