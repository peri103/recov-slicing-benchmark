import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        ImmutableMap<String, Integer> map;
        /* write */ map = ImmutableMap.<String, Integer>builder().put("key", 42).build();
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}