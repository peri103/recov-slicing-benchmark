import org.apache.commons.lang3.builder.HashCodeBuilder;

public class HashCodeWriter {
    private HashCodeBuilder builder = new HashCodeBuilder();

    public void appendValue(int value) {
        /* write */ builder.append(value);
    }

    public HashCodeBuilder getBuilder() {
        return builder;
    }
}
