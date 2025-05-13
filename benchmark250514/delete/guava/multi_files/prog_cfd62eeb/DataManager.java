import com.google.common.collect.LinkedHashMultimap;

public class DataManager {
    private LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();

    public void addData(String key, String value) {
        /* write */ multimap.put(key, value);
    }

    public LinkedHashMultimap<String, String> getData() {
        return multimap;
    }
}
