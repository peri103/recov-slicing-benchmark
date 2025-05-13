import org.apache.commons.lang3.text.StrBuilder;

public class TextManipulator {
    private StrBuilder strBuilder;

    public TextManipulator(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void deleteText(int start, int end) {
        /* write */ strBuilder.delete(start, end);
    }

    public String getText() {
        return strBuilder.toString();
    }
}
