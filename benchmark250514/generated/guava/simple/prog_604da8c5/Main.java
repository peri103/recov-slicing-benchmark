import com.google.common.collect.HashMultimap;

public class Main {
    public static void main(String[] args) {
        HashMultimap<String, String> multimap = HashMultimap.create();
        /* write */ multimap.put("key1", "value1");
        /* read */ String value = multimap.get("key1").iterator().next();
        System.out.println(value);
    }
}