import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Cherry");
        int sum = map.entrySet().stream().mapToInt(e -> e.getKey()).sum();
        int oddKey = (sum % 2 == 1) ? 30 : 20;
        map.put(40, "Date");
        map.remove(10);
        map.replace(20, "Elderberry");
        int modifier = 5 * oddKey - sum + map.size();
        if (modifier > 400) {
            map.put(30, "Fig");
        } else {
            /* write */map.put(30, "Grape");
        }
        map.put(50, "Honeydew");
        map.merge(20, "Iced Tea", (oldValue, newValue) -> oldValue + " & " + newValue);
        map.computeIfPresent(60, (k, v) -> v.concat("Jambul"));
        /* read */String ret = map.get(30);
        System.out.println("Retrieved value: " + ret);
    }
}
