import org.apache.commons.collections4.map.MultiKeyMap;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, String> multiKeyMap = new MultiKeyMap<>();
        
        // Initialize keys and value
        String key1 = "key1";
        String key2 = "key2";
        String valueToWrite = "value";

        /* write */ multiKeyMap.put(key1, key2, valueToWrite);
        /* read */ String valueRead = multiKeyMap.get(key1, key2);

        System.out.println(valueRead);
    }
}