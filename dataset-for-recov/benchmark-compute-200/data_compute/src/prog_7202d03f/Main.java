import java.util.WeakHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new WeakHashMap<>();
        /* other operations */
        String key1 = "key";
        String key2 = new String("key");
        /* other operations */
        map.put(key1, 100);
        map.put("temp", 50);
        map.put("anotherKey", 200);
        /* other operations */
        int conditionValue = key2.hashCode() * 123 + 456;
        /* other operations */
        if (conditionValue % 4 == 0) {
            map.put("temp", 150);
        } else {
            /* write */ map.put(key2, 250);
        }
        map.remove("anotherKey");
        map.put("unrelated", 300);
        /* other operations */
        /* read */ int ret = map.get("key");
        System.out.println(ret);
    }
}
