import org.apache.commons.collections4.map.ListOrderedMap;

public class Main {
    public static void main(String[] args) {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}