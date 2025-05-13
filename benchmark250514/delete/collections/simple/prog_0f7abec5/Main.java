import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}