import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();
        /* write */ map.put("key", 42);
        /* read */ Collection<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}