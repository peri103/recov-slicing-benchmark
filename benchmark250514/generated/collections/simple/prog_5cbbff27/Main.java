import org.apache.commons.collections4.map.AbstractHashedMap;

public class Main {
    public static void main(String[] args) {
        AbstractHashedMap<String, Integer> map = new AbstractHashedMap<String, Integer>() {};
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}