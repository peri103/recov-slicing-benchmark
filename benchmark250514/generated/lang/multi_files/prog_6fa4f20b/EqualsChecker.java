import org.apache.commons.lang3.builder.EqualsBuilder;

public class EqualsChecker {
    private EqualsBuilder equalsBuilder = new EqualsBuilder();

    public void appendObjects(Object obj1, Object obj2) {
        /* write */ equalsBuilder.append(obj1, obj2);
    }

    public boolean checkEquality() {
        return equalsBuilder.isEquals();
    }
}
