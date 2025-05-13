import org.apache.commons.lang3.text.StrBuilder;

public class StrManipulator {
    private StrBuilder strBuilder;

    public StrManipulator(String initialString) {
        this.strBuilder = new StrBuilder(initialString);
    }

    public void modifyString() {
        /* write */ strBuilder.delete(5, 11); // Deletes " World"
    }

    public String getString() {
        return strBuilder.toString();
    }
}