import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        boolean value1 = true;
        boolean value2 = true;

        EqualsBuilder equalsBuilder = new EqualsBuilder();
        /* write */ equalsBuilder.append(value1, value2);
        /* read */ boolean result = equalsBuilder.isEquals();
        
        System.out.println(result);
    }
}