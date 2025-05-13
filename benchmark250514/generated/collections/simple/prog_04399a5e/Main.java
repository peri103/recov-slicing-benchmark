import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> initialMap = new HashMap<>();
        initialMap.put("key1", "initialValue1");
        initialMap.put("key2", "initialValue2");

        FixedSizeMap<String, String> fixedSizeMap = FixedSizeMap.fixedSizeMap(initialMap);

        /* write */ fixedSizeMap.put("key1", "value1");
        /* read */ String value = fixedSizeMap.get("key1");

        System.out.println(value);
    }
}