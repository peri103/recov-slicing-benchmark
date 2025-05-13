import com.google.common.collect.ForwardingSortedMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        ForwardingSortedMap<String, Integer> forwardingSortedMap = new ForwardingSortedMap<String, Integer>() {
            @Override
            protected SortedMap<String, Integer> delegate() {
                return sortedMap;
            }
        };

        /* write */ forwardingSortedMap.put("key1", 100);
        /* read */ int value = forwardingSortedMap.get("key1");
        System.out.println(value);
    }
}