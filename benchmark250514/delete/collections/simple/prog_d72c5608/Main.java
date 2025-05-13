import org.apache.commons.collections4.multimap.TreeValuedHashMap;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();
        /* write */ map.put("key1", 42);
        /* read */ Integer value = map.get("key1").first();
        System.out.println(value);
    }
}