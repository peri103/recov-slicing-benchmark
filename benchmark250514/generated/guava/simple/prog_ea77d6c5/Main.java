import com.google.common.collect.HashBiMap;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        /* write */ map.put("key1", 100);
        /* read */ int value = map.get("key1");
        System.out.println(value);
    }
}