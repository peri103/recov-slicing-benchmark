import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        TransformedMap<String, String> transformedMap = TransformedMap.transformingMap(map, String::toUpperCase, String::toLowerCase);
        
        /* write */ transformedMap.put("key", "VALUE");
        /* read */ String value = transformedMap.get("key");
        
        System.out.println(value);
    }
}