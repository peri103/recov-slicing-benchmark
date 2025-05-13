import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        /* write */ equalsBuilder.append(1, 1);
        /* read */ boolean isEqual = equalsBuilder.isEquals();
        System.out.println(isEqual);
    }
}