import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        ToStringBuilder builder = new ToStringBuilder("Example");
        HashCodeBuilder hashBuilder = new HashCodeBuilder();
        EqualsBuilder equalsBuilder = new EqualsBuilder();

        // Initialize some variables
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";

        // Use EqualsBuilder to compare two strings
        boolean isEqual = equalsBuilder.append(key1, key2).isEquals();
        System.out.println("Are keys equal? " + isEqual);

        // Use HashCodeBuilder to create hash code
        int hashCode = hashBuilder.append(value1).append(value2).toHashCode();
        System.out.println("Hash code: " + hashCode);

        // Use ToStringBuilder to append values
        /* write */ builder.append("key", "value");

        // More operations
        builder.append(key1, value1);
        builder.append(key2, value2);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Finally, read the string representation
        /* read */ String result = builder.toString();
        System.out.println(result);
    }
}