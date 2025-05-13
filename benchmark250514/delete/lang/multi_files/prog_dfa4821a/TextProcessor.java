import org.apache.commons.lang3.text.StrBuilder;

public class TextProcessor {
    private StrBuilder strBuilder = new StrBuilder();

    public void appendSeparator() {
        /* write */ strBuilder.appendSeparator(",");
    }

    public void appendText(String text) {
        strBuilder.append(text);
    }

    public String getText() {
        return strBuilder.toString();
    }
}
