import org.apache.commons.lang3.text.StrBuilder;

public class StrManipulator {
    private StrBuilder strBuilder;

    public StrManipulator(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void deleteFirstOccurrence(String text) {
        /* write */ strBuilder.deleteFirst(text);
    }

    public void appendText(String text) {
        strBuilder.append(text);
    }

    public void insertText(int index, String text) {
        strBuilder.insert(index, text);
    }

    public String getText() {
        return strBuilder.toString();
    }
}
