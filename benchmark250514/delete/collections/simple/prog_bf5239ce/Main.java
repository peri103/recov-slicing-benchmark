import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, String> multiValuedMap = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(multiValuedMap);

        /* write */ multiValuedMap.put("key", "value");

        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        System.out.println(value);
    }
}