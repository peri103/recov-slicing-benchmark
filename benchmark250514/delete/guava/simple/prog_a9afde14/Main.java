import com.google.common.collect.LinkedHashBiMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, String> map = LinkedHashBiMap.create();
        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}