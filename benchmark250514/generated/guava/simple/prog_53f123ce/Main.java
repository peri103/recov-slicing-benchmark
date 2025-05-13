import com.google.common.collect.LinkedListMultimap;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        /* write */ multimap.put("key", 123);
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}