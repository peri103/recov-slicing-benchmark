import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ToStringBuilder builder = new ToStringBuilder("Initial");
        /* write */ builder.append("key", "value");

        // Additional complex code using EqualsBuilder
        EqualsBuilder equalsBuilder1 = new EqualsBuilder();
        EqualsBuilder equalsBuilder2 = new EqualsBuilder();
        String str1 = "Hello";
        String str2 = "World";
        equalsBuilder1.append(str1, str2);
        equalsBuilder2.append(str1, "Hello");

        boolean areEqual1 = equalsBuilder1.isEquals();
        boolean areEqual2 = equalsBuilder2.isEquals();

        System.out.println("Are str1 and str2 equal? " + areEqual1);
        System.out.println("Is str1 equal to 'Hello'? " + areEqual2);

        // Using a HashMap to store some values
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }

        System.out.println("Sum of values in the map: " + sum);

        // Continue with the original read operation
        /* read */ String result = builder.toString();
        System.out.println(result);

        // Further manipulation of the map
        map.put("four", 4);
        map.put("five", 5);

        sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }

        System.out.println("Updated sum of values in the map: " + sum);
    }
}