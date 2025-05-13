import org.apache.commons.lang3.text.StrBuilder;

public class TextModifier {
    private StrBuilder strBuilder;

    public TextModifier(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void modifyText(String search, String replace) {
        /* write */ strBuilder.replaceAll(search, replace);
    }

    public String getText() {
        return strBuilder.toString();
    }
}
