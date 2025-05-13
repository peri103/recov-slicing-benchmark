import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a ToStringBuilder instance
        ToStringBuilder builder = new ToStringBuilder("TestObject", ToStringStyle.JSON_STYLE);

        // Create a HashMap to store key-value pairs
        Map<String, String> map = new HashMap<>();
        map.put("name", "Alice");
        map.put("age", "30");
        map.put("country", "Wonderland");

        // Append map values to builder
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.append(entry.getKey(), entry.getValue());
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use another ToStringBuilder instance
        ToStringBuilder builder2 = new ToStringBuilder("AnotherObject");
        builder2.append("attribute", "value");
        String anotherResult = builder2.toString();
        System.out.println(anotherResult);

        // More unrelated operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Read the result from the original builder
        /* read */ String result = builder.toString();
        System.out.println(result);
    }
}