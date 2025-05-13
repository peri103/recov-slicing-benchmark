import org.apache.commons.lang3.builder.EqualsBuilder;

public class EqualityChecker {
    private EqualsBuilder equalsBuilder = new EqualsBuilder();

    public void appendValues(int a, int b) {
        /* write */ equalsBuilder.append(a, b);
    }

    public boolean checkEquality() {
        return equalsBuilder.isEquals();
    }
}
