import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        Object left = new Object();
        Object right = new Object();
        
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        /* write */ equalsBuilder.append(left, left); // Using the append method to compare two objects
        /* read */ boolean isEqual = equalsBuilder.isEquals(); // Checking if the objects are equal
        
        System.out.println(isEqual);
    }
}