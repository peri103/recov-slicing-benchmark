import java.util.IdentityHashMap;
public class Main {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("Initial", 1);
        map.put("Key", 0);
        map.put("Dummy", 2);
        int randomValue = 9876 * 5432 + 123 - 789;
        String key = "A";
        if (randomValue % 2 == 0) {
            /* write */map.put("Key", 3);
            key = "B";
        }
        map.put("RandomKey", randomValue % 100);
        for (int i = 0; i < 10; i++) {
            map.put("Key" + i, i);
        }
        boolean condition = (randomValue % 5 == 0);
        if (condition) {
            map.put("Key", 42);
        }
        map.put("Misleading2", -1);
        /* read */int ret = map.get("Key");
        System.out.println("Value read: " + ret);
    }
}
