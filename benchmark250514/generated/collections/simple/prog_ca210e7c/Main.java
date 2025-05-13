import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap (a concrete subclass of AbstractReferenceMap)
        ReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);

        // Use the write method
        /* write */ map.put("key", 100);

        // Use the read method
        /* read */ Integer value = map.get("key");

        // Output the value to ensure it was read correctly
        System.out.println(value);
    }
}