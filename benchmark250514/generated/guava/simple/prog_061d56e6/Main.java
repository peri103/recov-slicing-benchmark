import com.google.common.collect.LinkedHashMultimap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, Integer> multimap = LinkedHashMultimap.create();
        /* write */ multimap.put("key", 42);
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}