import org.apache.commons.collections4.map.ListOrderedMap;

public class Main {
    public static void main(String[] args) {
        ListOrderedMap<String, String> map = new ListOrderedMap<>();
        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}