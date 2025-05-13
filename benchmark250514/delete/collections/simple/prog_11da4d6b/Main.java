import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = (Integer) map.get("key").iterator().next();
        System.out.println(value);
    }
}