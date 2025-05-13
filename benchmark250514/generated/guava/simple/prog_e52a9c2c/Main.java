import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        ImmutableMap.Builder<String, Integer> builder = new ImmutableMap.Builder<>();
        /* write */ builder.put("key", 42);
        ImmutableMap<String, Integer> map = builder.build();
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}