import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        /* write */ multimap.put("key1", 42);
        /* read */ Integer value = multimap.get("key1").get(0);
        System.out.println(value);
    }
}