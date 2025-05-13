import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> bidiMap = new DualHashBidiMap<>();
        /* write */ bidiMap.put("key", 100);
        /* read */ int value = bidiMap.get("key");
        System.out.println(value);
    }
}