import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        EnumHashBiMap<MyEnum, Integer> map = EnumHashBiMap.create(MyEnum.class);
        /* write */ map.put(MyEnum.VALUE_ONE, 100);
        /* read */ Integer value = map.get(MyEnum.VALUE_ONE);
        System.out.println(value);
    }

    private enum MyEnum {
        VALUE_ONE, VALUE_TWO
    }
}