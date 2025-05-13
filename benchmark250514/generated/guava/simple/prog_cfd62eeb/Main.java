import com.google.common.collect.LinkedHashMultimap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
        /* write */ multimap.put("key", "value");
        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}