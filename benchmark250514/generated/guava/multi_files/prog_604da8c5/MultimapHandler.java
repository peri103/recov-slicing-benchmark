import com.google.common.collect.HashMultimap;

public class MultimapHandler {
    private HashMultimap<String, String> multimap = HashMultimap.create();

    public void addEntry(String key, String value) {
        /* write */ multimap.put(key, value);
    }

    public HashMultimap<String, String> getMultimap() {
        return multimap;
    }
}
