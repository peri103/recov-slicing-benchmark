import com.google.common.collect.ForwardingSortedMap;
import java.util.TreeMap;

public class CustomMap<K, V> extends ForwardingSortedMap<K, V> {
    private final TreeMap<K, V> delegate = new TreeMap<>();

    @Override
    protected TreeMap<K, V> delegate() {
        return delegate;
    }

    public void addEntry(K key, V value) {
        /* write */ put(key, value);
    }
}
