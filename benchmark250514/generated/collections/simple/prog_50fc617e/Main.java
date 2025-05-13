import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.MultiValuedMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        /* write */ map.put("key1", 42);
        /* read */ Integer value = map.get("key1").iterator().next();
        System.out.println(value);
    }
}