import com.google.common.collect.ForwardingSortedMap;
import java.util.TreeMap;

public class CustomMap extends ForwardingSortedMap<String, Integer> {
    private final TreeMap<String, Integer> delegate = new TreeMap<>();

    @Override
    protected TreeMap<String, Integer> delegate() {
        return delegate;
    }

    public void addEntry(String key, Integer value) {
        /* write */ put(key, value);
    }
}
