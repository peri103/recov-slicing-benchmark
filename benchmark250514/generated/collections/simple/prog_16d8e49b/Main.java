import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, String> map = new HashSetValuedHashMap<>();
        /* write */ map.put("key", "value");
        /* read */ Collection<String> values = map.get("key");
        for (String value : values) {
            System.out.println(value);
        }
    }
}