import java.util.Properties;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        /* write */ props.setProperty("key", "value");

        // Additional code to make the program more complex
        Map<String, String> map = new HashMap<>();
        map.put("anotherKey", "anotherValue");
        map.put("yetAnotherKey", "yetAnotherValue");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ String value = props.getProperty("key");
        System.out.println("Value from Properties: " + value);

        // Even more unrelated code
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}