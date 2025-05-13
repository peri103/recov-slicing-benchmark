import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using DualHashBidiMap which is a concrete implementation of AbstractDualBidiMap
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();

        // Write operation
        /* write */ map.put("key1", 100);

        // Read operation
        /* read */ int value = map.get("key1");
        
        // Output the read value
        System.out.println(value);
    }
}