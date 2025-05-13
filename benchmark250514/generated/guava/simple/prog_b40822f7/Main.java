import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the EnumHashBiMap with a sample enum class
        EnumHashBiMap<MyEnum, String> map = EnumHashBiMap.create(MyEnum.class);
        
        /* write */ map.put(MyEnum.VALUE1, "Hello");
        
        /* read */ String value = map.get(MyEnum.VALUE1);
        
        System.out.println(value);
    }
    
    private enum MyEnum {
        VALUE1, VALUE2
    }
}