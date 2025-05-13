import com.google.common.collect.ForwardingSortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a TreeMap which will be used by ForwardingSortedMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Extend ForwardingSortedMap to provide access to the TreeMap
        ForwardingSortedMap<String, Integer> forwardingSortedMap = new ForwardingSortedMap<String, Integer>() {
            @Override
            protected TreeMap<String, Integer> delegate() {
                return treeMap;
            }
        };

        /* write */ forwardingSortedMap.put("key", 100);
        /* read */ int value = forwardingSortedMap.get("key");
        System.out.println(value);
    }
}