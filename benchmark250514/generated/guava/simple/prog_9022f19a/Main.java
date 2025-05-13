import com.google.common.collect.HashBiMap;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> biMap = HashBiMap.create();
        /* write */ biMap.put("key1", 100);
        /* read */ Integer value = biMap.get("key1");
        System.out.println(value);
    }
}