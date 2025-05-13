import com.google.common.collect.ImmutableBiMap;

public class BiMapReader {
    private ImmutableBiMap<String, Integer> biMap;

    public BiMapReader(ImmutableBiMap<String, Integer> biMap) {
        this.biMap = biMap;
    }

    public Integer getValue(String key) {
        /* read */ return biMap.get(key);
    }
}
