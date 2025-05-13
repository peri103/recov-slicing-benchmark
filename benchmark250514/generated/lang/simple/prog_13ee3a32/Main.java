import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Main {
    public static void main(String[] args) {
        // Initialize HashCodeBuilder object
        HashCodeBuilder builder = new HashCodeBuilder();

        // Append a value to the hash code builder
        /* write */ builder.append(123);

        // Retrieve the computed hash code
        /* read */ int hashCode = builder.toHashCode();

        // Print the hash code
        System.out.println(hashCode);
    }
}