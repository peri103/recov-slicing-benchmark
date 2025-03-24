import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 0);
        map.put("key2", 1);
        map.put("key3", 2);
        int x = calculateX();
        processMap(map, x);
        map.put("key2", 42);
        reverseMapOperations(map);
        if (x > 1000) {
            map.put("key1", 42);
        }
        irrelevantComputation(map);
        /* read */int ret = map.get("key3");
        System.out.println("Read value: " + ret);
    }
    private static int calculateX() {
        int base = 123;
        return base * 8;
    }
    private static void processMap(HashMap<String, Integer> map, int x) {
        if (x < 200) {
            map.remove("key3");
        } else {
            map.put("key3", 100);
        }
    }
    private static void reverseMapOperations(HashMap<String, Integer> map) {
        if (map.containsKey("key2") && map.get("key2") == 42) {
            map.put("key2", -1);
        }
    }
    private static void irrelevantComputation(HashMap<String, Integer> map) {
        for(String key : map.keySet()) {
            map.put(key, map.get(key) + 1);
        }
        map.put("key4", 0);
        map.remove("key4");
    }
}
