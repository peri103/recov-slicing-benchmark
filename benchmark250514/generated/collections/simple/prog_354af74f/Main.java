import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, String> map = new MultiValueMap<>();
        
        /* write */ map.put("key", "value");
        
        /* read */ String value = (String) map.get("key");
        
        System.out.println(value);
    }
}