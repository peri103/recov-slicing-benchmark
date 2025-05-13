import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;

public class CustomMap<K, V> extends AbstractOrderedMapDecorator<K, V> {
    public CustomMap() {
        super(new HashMap<>());
    }

    public void addEntry(K key, V value) {
        /* write */ this.put(key, value);
    }

    public V retrieveEntry(K key) {
        return this.get(key);
    }
}
