import java.util.WeakHashMap;
public class Main {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        int computation = (int) (Math.random() * 100);
        int n = computation % 5;
        map.put("key1", n);
        map.put("key2", n * 2);
        /* write */map.put("key3", 3);
        String keySelection = (n % 2 == 0) ? "key3" : "key4";
        map.put(keySelection, 6);
        map.put("key", n * 5);
        map.put("key5", n * 4);
        map.remove("key4");
        map.put("key6", n);
        /* read */int ret = map.get("key3");
        System.out.println("Retrieved value: " + ret);
    }
}