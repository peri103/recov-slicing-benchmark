import com.google.common.collect.HashBiMap;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        /* write */ map.put("one", 1);
        /* read */ Integer value = map.get("one");
        System.out.println(value);
    }
}