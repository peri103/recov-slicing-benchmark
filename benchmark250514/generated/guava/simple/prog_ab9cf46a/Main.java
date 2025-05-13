import com.google.common.collect.HashBiMap;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> biMap = HashBiMap.create();
        /* write */ biMap.put("key", 42);
        /* read */ int value = biMap.get("key");
        System.out.println(value);
    }
}