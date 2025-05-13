import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        
        // Initialize two objects to compare
        Object object1 = new Object();
        Object object2 = object1; // Same reference to ensure equality
        
        /* write */ equalsBuilder.append(object1, object2);
        
        /* read */ boolean isEqual = equalsBuilder.isEquals();
        
        System.out.println("Objects are equal: " + isEqual);
    }
}