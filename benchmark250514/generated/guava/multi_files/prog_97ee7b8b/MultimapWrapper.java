import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

public class MultimapWrapper {
    private Multimap<String, Integer> multimap;

    public MultimapWrapper() {
        this.multimap = LinkedHashMultimap.create();
    }

    public void addEntry(String key, int value) {
        /* write */ multimap.put(key, value);
    }

    public Integer getFirstValue(String key) {
        return multimap.get(key).iterator().next();
    }
}
