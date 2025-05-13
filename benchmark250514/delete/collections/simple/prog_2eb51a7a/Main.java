import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using a concrete implementation of AbstractDualBidiMap
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();

        /* write */ map.put("key1", 100);
        /* read */ Integer value = map.get("key1");

        System.out.println(value);
    }
}