import com.google.common.collect.LinkedListMultimap;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, String> multimap = LinkedListMultimap.create();
        /* write */ multimap.put("key", "value");
        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}