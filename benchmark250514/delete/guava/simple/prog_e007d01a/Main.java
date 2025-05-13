import com.google.common.collect.LinkedHashBiMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> map = LinkedHashBiMap.create();
        /* write */ map.put("key1", 42);
        /* read */ Integer value = map.get("key1");
        System.out.println(value);
    }
}