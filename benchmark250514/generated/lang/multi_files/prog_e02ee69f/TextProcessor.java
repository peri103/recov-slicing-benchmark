import org.apache.commons.lang3.text.StrBuilder;

public class TextProcessor {
    private StrBuilder strBuilder;

    public TextProcessor(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void deleteFirstOccurrence(String text) {
        /* write */ strBuilder.deleteFirst(text);
    }

    public String getText() {
        return strBuilder.toString();
    }
}
