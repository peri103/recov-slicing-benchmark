import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        AbstractSortedMapDecorator<Integer, String> mapDecorator = new AbstractSortedMapDecorator<>(treeMap) {};
        
        /* write */ mapDecorator.put(1, "Hello");
        /* read */ String value = mapDecorator.get(1);
        
        System.out.println(value);
    }
}