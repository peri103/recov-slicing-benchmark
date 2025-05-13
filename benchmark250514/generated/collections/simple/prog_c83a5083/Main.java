import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map with appropriate reference types.
        AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);

        /* write */ map.put("key", 42);

        /* read */ Integer value = map.get("key");

        System.out.println(value);
    }
}