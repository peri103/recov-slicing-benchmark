import com.google.common.collect.LinkedHashBiMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> map = LinkedHashBiMap.create();
        /* write */ map.put("key", 100);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}