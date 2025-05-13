import org.apache.commons.collections4.multimap.LinkedHashValuedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashValuedHashMap<String, Integer> map = new LinkedHashValuedHashMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println(value);
    }
}