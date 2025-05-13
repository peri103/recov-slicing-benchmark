import com.google.common.collect.LinkedHashMultimap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
        /* write */ multimap.put("key", "value");
        /* read */ java.util.Set<String> values = multimap.get("key");
        for (String value : values) {
            System.out.println(value);
        }
    }
}