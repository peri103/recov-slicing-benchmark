import com.google.common.collect.HashMultimap;

public class Main {
    public static void main(String[] args) {
        HashMultimap<String, Integer> multimap = HashMultimap.create();
        /* write */ multimap.put("key", 42);
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}