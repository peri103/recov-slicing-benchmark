import org.apache.commons.collections4.map.ListOrderedMap;

public class Main {
    public static void main(String[] args) {
        ListOrderedMap<String, Integer> map = new ListOrderedMap<>();
        /* write */ map.put("key1", 42);
        /* read */ int value = map.get("key1");
        System.out.println(value);
    }
}