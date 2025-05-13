import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValuedMapBuilder;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = MultiValuedMapBuilder.hashMap().arrayListValues().build();
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(map, null, null);

        /* write */ transformedMap.put("key1", 42);

        /* read */ Collection<Integer> values = transformedMap.get("key1");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}