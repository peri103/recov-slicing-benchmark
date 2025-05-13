import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        /* write */ ImmutableMap<String, Integer> map = ImmutableMap.of("key1", 1);
        /* read */ boolean containsKey = map.containsKey("key1");
        System.out.println(containsKey);
    }
}