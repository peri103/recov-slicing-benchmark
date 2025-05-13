import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();
        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key").iterator().next();
        System.out.println(value);
    }
}