import org.apache.commons.collections4.map.MultiValueMap;
import java.util.Collection;

public class DataProcessor {
    private MultiValueMap<String, Integer> map;

    public DataProcessor(MultiValueMap<String, Integer> map) {
        this.map = map;
    }

    public Integer readValue(String key) {
        /* read */ return (Integer) map.get(key).iterator().next();
    }

    public void processData() {
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Values: " + map.get(key));
        }
    }
}