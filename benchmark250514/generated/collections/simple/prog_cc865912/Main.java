import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> originalMap = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> map = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(originalMap);

        /* write */ originalMap.put("key", 42); // The write operation should be done on the original map

        /* read */ Integer value = map.get("key").iterator().next(); // Retrieve the value from the unmodifiable map
        System.out.println(value);
    }
}