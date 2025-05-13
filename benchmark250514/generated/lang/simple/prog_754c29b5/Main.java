import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Main {
    public static void main(String[] args) {
        HashCodeBuilder builder = new HashCodeBuilder();
        /* write */ builder.append(123);
        /* read */ int hashCode = builder.toHashCode();
        System.out.println(hashCode);
    }
}