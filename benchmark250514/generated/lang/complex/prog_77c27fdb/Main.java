import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding numbers to the list
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        
        // Calculate hash code for the list
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        for (Integer num : numbers) {
            hashCodeBuilder.append(num);
        }
        int hashCode = hashCodeBuilder.toHashCode();
        System.out.println("Hash Code: " + hashCode);
        
        // Perform some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Use EqualsBuilder to compare two values
        /* write */ equalsBuilder.append(true, true);
        
        // More operations
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
        
        // Check equality
        /* read */ boolean isEqual = equalsBuilder.isEquals();
        System.out.println("Are the values equal? " + isEqual);
        
        // Another EqualsBuilder example
        EqualsBuilder anotherEqualsBuilder = new EqualsBuilder();
        anotherEqualsBuilder.append("Hello", "Hello");
        boolean areStringsEqual = anotherEqualsBuilder.isEquals();
        System.out.println("Are the strings equal? " + areStringsEqual);
    }
}