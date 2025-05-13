import org.apache.commons.collections4.map.DefaultedMap;

public class Main {
    public static void main(String[] args) {
        DefaultedMap<String, Integer> map = new DefaultedMap<>(0);
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}