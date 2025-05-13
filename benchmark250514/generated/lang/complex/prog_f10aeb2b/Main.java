import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Main {
    public static void main(String[] args) {
        ToStringBuilder builder = new ToStringBuilder(Main.class);

        // Additional logic
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Using EqualsBuilder and HashCodeBuilder for additional complexity
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        boolean isEqual = equalsBuilder.append(numbers, new int[]{1, 2, 3, 4, 5}).isEquals();
        int hashCode = hashCodeBuilder.append(numbers).toHashCode();

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Arrays are equal: " + isEqual);
        System.out.println("Hash code: " + hashCode);

        /* write */ builder.append("key", "value");

        // More operations to increase complexity
        String message = "Complex operations";
        for (char c : message.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Performing some mathematical operations
        double result = Math.pow(sum, 2) + Math.sqrt(sum);
        System.out.println("Result of mathematical operations: " + result);

        /* read */ String resultString = builder.toString();
        System.out.println(resultString);
    }
}