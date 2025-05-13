import com.google.common.collect.ForwardingSortedMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> baseMap = new TreeMap<>();
        ForwardingSortedMap<String, Integer> map = new ForwardingSortedMap<String, Integer>() {
            @Override
            protected SortedMap<String, Integer> delegate() {
                return baseMap;
            }
        };
        
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        
        System.out.println(value);
    }
}