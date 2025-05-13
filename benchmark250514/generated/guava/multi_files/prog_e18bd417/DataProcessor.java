public class DataProcessor {
    private CustomMap map;

    public DataProcessor(CustomMap map) {
        this.map = map;
    }

    public int getValue(String key) {
        return map.get(key);
    }
}
