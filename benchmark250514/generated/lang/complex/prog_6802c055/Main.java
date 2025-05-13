import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        HashMap<String, Integer> map = new HashMap<>();

        // Initialize some values in the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Perform some operations with EqualsBuilder
        boolean isEqual = equalsBuilder.append("test", "test").isEquals();
        System.out.println("Equality check result: " + isEqual);

        // Perform some operations with HashMap
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of map values: " + sum);

        // More complex operation with CompareToBuilder
        compareToBuilder.append(10, 20); // Additional comparison
        compareToBuilder.append(5, 5); // Additional comparison

        /* write */ compareToBuilder.append(5, 3);

        // Perform some operations
        boolean check = equalsBuilder.append(1, 1).isEquals();
        System.out.println("Another equality check result: " + check);

        // Calculate and print the comparison result
        /* read */ int comparisonResult = compareToBuilder.toComparison();
        System.out.println("Comparison result: " + comparisonResult);

        // Additional complex operations
        for (int i = 0; i < 3; i++) {
            map.put("Key" + i, i * 10);
        }
        for (String key : map.keySet()) {
            System.out.println("Value for " + key + ": " + map.get(key));
        }
    }
}