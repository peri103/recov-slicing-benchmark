import org.apache.commons.collections4.multimap.LinkedHashValuedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashValuedHashMap<String, String> map = new LinkedHashValuedHashMap<>();
        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key").iterator().next();
        System.out.println(value);
    }
}