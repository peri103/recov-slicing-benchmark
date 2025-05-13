import com.google.common.collect.HashMultimap;

public class Main {
    public static void main(String[] args) {
        HashMultimap<String, Integer> multimap = HashMultimap.create();
        /* write */ multimap.put("key", 42);
        /* read */ java.util.Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}