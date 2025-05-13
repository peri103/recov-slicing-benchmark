import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.Collection;

public class ForwardingMultimapWrapper {
    private ForwardingMultimap<String, String> multimap;

    public ForwardingMultimapWrapper() {
        this.multimap = new ForwardingMultimap<String, String>() {
            private final ArrayListMultimap<String, String> delegate = ArrayListMultimap.create();

            @Override
            protected ArrayListMultimap<String, String> delegate() {
                return delegate;
            }
        };
    }

    public void addEntry(String key, String value) {
        /* write */ multimap.put(key, value);
    }

    public Collection<String> getValues(String key) {
        return multimap.get(key);
    }
}
