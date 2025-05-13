import com.google.common.collect.TreeMultimap;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        /* write */ multimap.put("key", 42);
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}