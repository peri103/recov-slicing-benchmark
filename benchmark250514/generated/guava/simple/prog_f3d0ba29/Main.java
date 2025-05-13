import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;

public class Main {
    public static void main(String[] args) {
        BiMap<String, Integer> biMap = HashBiMap.create();
        /* write */ biMap.put("key1", 100);
        /* read */ int value = biMap.get("key1");
        System.out.println(value);
    }
}