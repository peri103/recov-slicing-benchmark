import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        /* write */ equalsBuilder.append(5, 5);
        /* read */ boolean areEqual = equalsBuilder.isEquals();
        System.out.println(areEqual);
    }
}