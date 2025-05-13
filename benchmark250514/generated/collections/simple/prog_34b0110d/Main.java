import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, String> map = new HashSetValuedHashMap<>();
        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key").iterator().next();
        System.out.println(value);
    }
}