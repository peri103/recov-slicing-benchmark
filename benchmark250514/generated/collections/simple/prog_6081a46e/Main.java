import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}