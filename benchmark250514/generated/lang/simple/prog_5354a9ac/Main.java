import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Main {
    public static void main(String[] args) {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        /* write */ hashCodeBuilder.append(123);
        /* read */ int hashCode = hashCodeBuilder.toHashCode();
        System.out.println(hashCode);
    }
}