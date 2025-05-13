import com.google.common.collect.EnumHashBiMap;

public class EnumValueMap {
    private EnumHashBiMap<ExampleEnum, String> enumHashBiMap;

    public EnumValueMap() {
        enumHashBiMap = EnumHashBiMap.create(ExampleEnum.class);
    }

    public void putValue(ExampleEnum key, String value) {
        /* write */ enumHashBiMap.put(key, value);
    }

    public String getValue(ExampleEnum key) {
        return enumHashBiMap.get(key);
    }
}
