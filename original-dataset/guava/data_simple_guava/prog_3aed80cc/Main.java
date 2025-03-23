import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableMap.builder();
        /* write */ builder.put("key1", 100);
        ImmutableMap<String, Integer> immutableMap = builder.build();
        /* read */ int value = immutableMap.get("key1");
        System.out.println(value);
    }
}