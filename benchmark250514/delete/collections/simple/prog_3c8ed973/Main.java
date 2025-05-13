import org.apache.commons.collections4.map.AbstractSortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeMap as AbstractSortedMap is abstract and cannot be instantiated directly
        AbstractSortedMap<Integer, String> map = new TreeMap<>();
        
        /* write */ map.put(1, "value1");
        
        /* read */ String value = map.get(1);
        
        System.out.println(value);
    }
}