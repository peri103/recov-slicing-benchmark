import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, String> multiValueMap = new MultiValueMap<>();
        /* write */ multiValueMap.put("key", "value");
        /* read */ String value = (String) multiValueMap.get("key").iterator().next();
        System.out.println(value);
    }
}