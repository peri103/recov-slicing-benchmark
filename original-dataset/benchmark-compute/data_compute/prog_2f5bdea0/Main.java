import java.util.Map;
import java.util.WeakHashMap;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new WeakHashMap<>();
        int[] keys = {1, 2, 3, 4, 5};
        String[] values = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        int misleadingVar = 42;
        map.remove(2);
        String dummy = map.get(3);
        if (dummy == null) {
            map.put(2, "z");
        }
        int computation = 0;
        for (int i = 0; i < 10; i++) {
            computation += i;
        }
        int conditionalKey = misleadingVar % 3 == 0 ? 6 : 1;
        /* write */map.put(conditionalKey, "important");
        map.put(7, "h");
        map.remove(7);
        String otherDummy = map.get(4);
        if (otherDummy != null) {
            map.put(5, "y");
        }
        /* read */String ret = map.get(1);
        System.out.println("Retrieved Value: " + ret);
    }
}