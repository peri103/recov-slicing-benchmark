import org.apache.commons.lang3.text.StrBuilder;

public class StringManipulator {
    private StrBuilder strBuilder;

    public StringManipulator(String initialString) {
        this.strBuilder = new StrBuilder(initialString);
    }

    public void deleteSubstring(String substring) {
        /* write */ strBuilder.deleteAll(substring);
    }

    public String getString() {
        return strBuilder.toString();
    }
}
