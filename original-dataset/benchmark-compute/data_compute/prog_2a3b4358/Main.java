import java.util.WeakHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        String keyA = new String("A");
        String keyB = new String("B");
        String keyC = new String("C");
        map.put(keyA, 100);
        map.put("temp", 300);
        if (keyB.hashCode() % 2 == 0) {
            map.put(keyB, 200);
        } else {
            /* write */map.put(keyC, 400);
        }
        map.remove("temp");
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        map.put("D", sum);
        keyA = null;
        System.gc();
        /* read */int ret = (map.containsKey("B") ? map.get("B") : map.get("C"));
        System.out.println("The retrieved value is: " + ret);
    }
}