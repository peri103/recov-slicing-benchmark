import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class BidiMapWrapper<K, V> {
    private AbstractBidiMapDecorator<K, V> bidiMap;

    public BidiMapWrapper() {
        this.bidiMap = new AbstractBidiMapDecorator<>(new TreeBidiMap<>());
    }

    public void put(K key, V value) {
        /* write */ bidiMap.put(key, value);
    }

    public V get(K key) {
        return bidiMap.get(key);
    }

    public int size() {
        return bidiMap.size();
    }

    public void remove(K key) {
        bidiMap.remove(key);
    }
}
