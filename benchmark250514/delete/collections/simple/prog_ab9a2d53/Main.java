import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        TransformedMap<String, Integer, String, Integer> transformedMap = TransformedMap.transformedMap(map, null, null);
        
        /* write */ transformedMap.put("key", 42);
        
        /* read */ int value = transformedMap.get("key");
        
        System.out.println(value);
    }
}