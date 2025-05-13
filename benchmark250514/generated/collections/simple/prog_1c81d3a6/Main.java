import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map with appropriate reference types
        ReferenceMap<String, String> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);

        /* write */ map.put("key", "value");

        /* read */ String value = map.get("key");

        System.out.println(value);
    }
}