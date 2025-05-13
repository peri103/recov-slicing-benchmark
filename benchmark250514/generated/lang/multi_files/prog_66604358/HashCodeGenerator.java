import org.apache.commons.lang3.builder.HashCodeBuilder;

public class HashCodeGenerator {
    private HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

    public void appendValue(int value) {
        hashCodeBuilder.append(value);
    }

    public int generateHashCode() {
        return hashCodeBuilder.toHashCode();
    }
}
