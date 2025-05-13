import org.apache.commons.lang3.text.StrBuilder;

public class TextManipulator {
    private StrBuilder strBuilder;

    public TextManipulator(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void replaceText(int start, int end, String replacement) {
        /* write */ strBuilder.replace(start, end, replacement);
    }

    public String getText() {
        return strBuilder.toString();
    }
}