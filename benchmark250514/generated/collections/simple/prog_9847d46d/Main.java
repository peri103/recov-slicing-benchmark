import org.apache.commons.collections4.map.MultiKeyMap;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();
        
        /* write */ multiKeyMap.put("key1", "key2", 42);
        
        /* read */ int value = multiKeyMap.get("key1", "key2");
        
        System.out.println(value);
    }
}