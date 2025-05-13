import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.FactoryUtils;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = LazyMap.lazyMap(new HashMap<>(), FactoryUtils.constantFactory(0));
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}