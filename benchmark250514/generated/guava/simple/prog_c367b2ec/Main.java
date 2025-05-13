import com.google.common.collect.LinkedListMultimap;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        /* write */ multimap.put("key1", 100);
        /* read */ Integer value = multimap.get("key1").get(0);
        System.out.println(value);
    }
}