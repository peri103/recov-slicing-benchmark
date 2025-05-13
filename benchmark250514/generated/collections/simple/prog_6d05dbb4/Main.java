import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        /* write */ map.put("key", 42);
        /* read */ java.util.Set<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}