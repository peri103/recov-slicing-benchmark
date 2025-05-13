import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        /* write */ hashCodeBuilder.append(123);

        // Initialize a list and add some elements
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Use EqualsBuilder to compare objects
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        boolean isEqual = equalsBuilder.append(numbers.get(0), numbers.get(1)).isEquals();

        // Print the result of the equality check
        System.out.println("Are the first two elements equal? " + isEqual);

        // Perform some calculations
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Manipulate the list
        numbers.add(50);
        numbers.remove(0);
        numbers.set(2, 99);

        // Print the updated list
        System.out.println("Updated numbers list: " + numbers);

        // Use another HashCodeBuilder instance
        HashCodeBuilder anotherHashCodeBuilder = new HashCodeBuilder();
        anotherHashCodeBuilder.append(456);
        int anotherHashCode = anotherHashCodeBuilder.toHashCode();
        System.out.println("Another hash code: " + anotherHashCode);

        // Finally, read the hash code from the original HashCodeBuilder
        /* read */ int hashCode = hashCodeBuilder.toHashCode();
        System.out.println("Original hash code: " + hashCode);
    }
}