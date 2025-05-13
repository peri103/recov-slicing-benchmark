import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the EnumHashBiMap with a sample enum
        enum SampleEnum { ONE, TWO, THREE }
        
        EnumHashBiMap<SampleEnum, Integer> map = EnumHashBiMap.create(SampleEnum.class);
        
        /* write */ map.put(SampleEnum.ONE, 1);
        
        /* read */ Integer value = map.get(SampleEnum.ONE);
        
        System.out.println(value);
    }
}