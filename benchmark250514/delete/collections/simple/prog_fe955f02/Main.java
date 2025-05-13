import org.apache.commons.collections4.multimap.TreeValuedHashMap;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, String> map = new TreeValuedHashMap<>();
        /* write */ map.put("key1", "value1");
        /* read */ String value = map.get("key1").first();
        System.out.println(value);
    }
}