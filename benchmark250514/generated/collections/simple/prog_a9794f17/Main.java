import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayListValuedHashMap<String, Integer> map = new ArrayListValuedHashMap<>();
        /* write */ map.put("key", 42);
        /* read */ Collection<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}