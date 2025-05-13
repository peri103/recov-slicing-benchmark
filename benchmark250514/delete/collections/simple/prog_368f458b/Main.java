import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> bidiMap = new DualHashBidiMap<>();
        
        /* write */ bidiMap.put("key1", 100);
        
        /* read */ Integer value = bidiMap.get("key1");
        
        System.out.println(value);
    }
}