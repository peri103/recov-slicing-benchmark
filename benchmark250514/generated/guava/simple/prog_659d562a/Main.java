import com.google.common.collect.ImmutableListMultimap;

public class Main {
    public static void main(String[] args) {
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        /* write */ builder.put("key", "value");
        ImmutableListMultimap<String, String> multimap = builder.build();
        /* read */ String value = multimap.get("key").get(0);
        System.out.println(value);
    }
}