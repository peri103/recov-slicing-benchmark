import java.util.Properties;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        Map<String, String> map = new HashMap<>();
        
        // Adding some unrelated code to make the program more complex
        map.put("mapKey1", "mapValue1");
        map.put("mapKey2", "mapValue2");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        /* write */ properties.setProperty("key", "value");
        
        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* read */ String value = properties.getProperty("key");
        System.out.println("Value read from Properties: " + value);
        
        // Additional unrelated code
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}