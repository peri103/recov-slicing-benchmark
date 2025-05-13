import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        /* write */ builder.put("key", "value");
        ImmutableMap<String, String> map = builder.build();
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}