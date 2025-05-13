import com.google.common.collect.LinkedListMultimap;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, String> multimap = LinkedListMultimap.create();
        /* write */ multimap.put("key", "value");
        /* read */ String value = multimap.get("key").get(0);
        System.out.println(value);
    }
}