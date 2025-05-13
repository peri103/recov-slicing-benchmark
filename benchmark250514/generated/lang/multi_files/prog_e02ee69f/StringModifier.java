import org.apache.commons.lang3.text.StrBuilder;

public class StringModifier {
    private StrBuilder strBuilder;

    public StringModifier(String initialString) {
        this.strBuilder = new StrBuilder(initialString);
    }

    public void modifyString() {
        /* write */ strBuilder.deleteFirst("Hello");
    }

    public String getString() {
        return strBuilder.toString();
    }
}
