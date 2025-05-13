import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, String> multiValueMap = new MultiValueMap<>();
        
        /* write */ multiValueMap.put("key", "value");
        
        /* read */ Object value = multiValueMap.get("key");
        
        System.out.println(value);
    }
}