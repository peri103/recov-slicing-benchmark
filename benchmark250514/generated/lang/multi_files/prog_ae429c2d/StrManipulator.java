import org.apache.commons.lang3.text.StrBuilder;

public class StrManipulator {
    private StrBuilder strBuilder;

    public StrManipulator(String initialString) {
        this.strBuilder = new StrBuilder(initialString);
    }

    public void trimString() {
        /* write */ strBuilder.trim();
    }

    public String getString() {
        return strBuilder.toString();
    }
}
