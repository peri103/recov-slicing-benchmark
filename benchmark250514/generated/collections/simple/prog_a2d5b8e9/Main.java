import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap instance
        AbstractReferenceMap<Integer, String> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);

        /* write */ map.put(1, "Hello, World!");

        /* read */ String value = map.get(1);

        System.out.println(value);
    }
}