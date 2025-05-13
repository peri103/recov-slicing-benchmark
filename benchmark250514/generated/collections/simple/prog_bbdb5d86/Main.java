import org.apache.commons.collections4.map.MultiKeyMap;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> map = new MultiKeyMap<>();
        /* write */ map.put("key1", "key2", 42);
        /* read */ int value = map.get("key1", "key2");
        System.out.println(value);
    }
}