import org.apache.commons.collections4.map.MultiKeyMap;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, String> multiKeyMap = new MultiKeyMap<>();
        /* write */ multiKeyMap.put("key1", "key2", "value");
        /* read */ String value = multiKeyMap.get("key1", "key2");
        System.out.println(value);
    }
}