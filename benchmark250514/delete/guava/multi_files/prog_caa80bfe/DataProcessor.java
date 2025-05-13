import com.google.common.collect.ImmutableSortedMap;

public class DataProcessor {
    private ImmutableSortedMap<String, Integer> map;

    public DataProcessor(ImmutableSortedMap<String, Integer> map) {
        this.map = map;
    }

    public Integer getValue(String key) {
        /* read */ return map.get(key);
    }
}
