import com.google.common.collect.LinkedHashBiMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> biMap = LinkedHashBiMap.create();
        /* write */ biMap.put("key1", 100);
        /* read */ Integer value = biMap.get("key1");
        System.out.println(value);
    }
}