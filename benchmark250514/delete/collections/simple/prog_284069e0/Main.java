import org.apache.commons.collections4.multimap.TreeValuedHashMap;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key").first();
        System.out.println(value);
    }
}