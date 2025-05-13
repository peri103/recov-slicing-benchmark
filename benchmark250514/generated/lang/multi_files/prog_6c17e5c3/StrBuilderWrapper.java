import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderWrapper {
    private StrBuilder strBuilder = new StrBuilder();

    public void initialize() {
        strBuilder.append("Initialization");
    }

    public void setCustomLength(int length) {
        /* write */ strBuilder.setLength(length);
    }

    public void appendText(String text) {
        strBuilder.append(text);
    }

    public String getText() {
        return strBuilder.toString();
    }
}