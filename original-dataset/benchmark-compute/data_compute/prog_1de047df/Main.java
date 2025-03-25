import java.util.IdentityHashMap;
public class Main {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        int seed = 1234 * 4321 + 777 + 888 + 999;
        int keySelector = seed % 10;
        map.put("initial", 0);
        map.put("dummy", 42);
        if (keySelector % 2 == 0) {
            /* write */map.put("target", 100);
        } else if (keySelector % 5 == 0) {
            map.put("target", 999);
        }
        map.put("extra", 33);
        /* read */int ret = map.get("target");
        System.out.println("Result: " + ret);
    }
}
