import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        /* write */ equalsBuilder.append(obj1, obj1);
        /* read */ boolean isEqual = equalsBuilder.isEquals();
        
        System.out.println(isEqual);
    }
}