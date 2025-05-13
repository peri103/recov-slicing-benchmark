import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        /* write */ builder.put("key", 1);
        
        ImmutableSortedMap<String, Integer> map = builder.build();
        /* read */ int value = map.get("key");
        
        System.out.println(value);
    }
}