import com.google.common.collect.EnumHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the EnumHashBiMap with a sample enum
        enum SampleEnum { ONE, TWO, THREE }
        
        EnumHashBiMap<SampleEnum, Integer> map = EnumHashBiMap.create(SampleEnum.class);
        
        // Initialize a HashMap to demonstrate additional complexity
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Key1", "Value1");
        stringMap.put("Key2", "Value2");
        
        // Perform operations on the HashMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Map Key: " + entry.getKey() + ", Map Value: " + entry.getValue());
        }
        
        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        
        /* write */ map.put(SampleEnum.ONE, 1);
        
        // Perform more operations on the HashMap
        stringMap.put("Key3", "Value3");
        stringMap.remove("Key1");
        
        // Perform additional calculations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
        
        /* read */ Integer value = map.get(SampleEnum.ONE);
        
        System.out.println("Value from EnumHashBiMap: " + value);
        
        // Final operations on the HashMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Final Map Key: " + entry.getKey() + ", Final Map Value: " + entry.getValue());
        }
    }
}