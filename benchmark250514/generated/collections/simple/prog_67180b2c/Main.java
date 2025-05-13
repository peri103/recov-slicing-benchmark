import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        ArrayListValuedHashMap<String, Integer> map = new ArrayListValuedHashMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println(value);
    }
}