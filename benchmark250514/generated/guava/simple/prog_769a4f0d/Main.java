import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableBiMap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableBiMap.builder();
        /* write */ builder.put("key", 42);
        
        ImmutableBiMap<String, Integer> biMap = builder.build();
        /* read */ int value = biMap.get("key");
        
        System.out.println(value);
    }
}