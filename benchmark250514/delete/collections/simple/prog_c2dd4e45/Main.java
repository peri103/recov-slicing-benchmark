import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, Integer> multiValueMap = new MultiValueMap<>();
        /* write */ multiValueMap.put("key", 42);
        /* read */ Integer value = (Integer) multiValueMap.get("key").iterator().next();
        System.out.println(value);
    }
}