import org.apache.commons.lang3.builder.HashCodeBuilder;

public class HashCodeManager {
    private HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

    public void addNumber(int number) {
        /* write */ hashCodeBuilder.append(number);
    }

    public int generateHashCode() {
        return hashCodeBuilder.toHashCode();
    }
}