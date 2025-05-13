import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
    public static void main(String[] args) {
        EqualsBuilder builder = new EqualsBuilder();
        /* write */ builder.append(1, 1);
        /* read */ boolean isEqual = builder.isEquals();
        System.out.println(isEqual);
    }
}