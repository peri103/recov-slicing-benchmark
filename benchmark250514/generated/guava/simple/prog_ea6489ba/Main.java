import com.google.common.collect.HashBiMap;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        /* write */ map.put("key", 123);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}