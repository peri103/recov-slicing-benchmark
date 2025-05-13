import org.apache.commons.lang3.builder.HashCodeBuilder;

public class HashCodeManager {
    private HashCodeBuilder builder = new HashCodeBuilder();

    public void appendValue(int value) {
        /* write */ builder.append(value);
    }

    public int getHashCode() {
        /* read */ return builder.toHashCode();
    }
}