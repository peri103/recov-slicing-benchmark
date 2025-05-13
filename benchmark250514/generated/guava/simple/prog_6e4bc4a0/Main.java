import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class Main {
    public static void main(String[] args) {
        BiMap<String, Integer> biMap = HashBiMap.create();
        /* write */ biMap.put("key", 42);
        /* read */ Integer value = biMap.get("key");
        System.out.println(value);
    }
}