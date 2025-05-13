import org.apache.commons.lang3.text.StrBuilder;

public class TextManipulator {
    private StrBuilder strBuilder;

    public TextManipulator() {
        this.strBuilder = new StrBuilder();
    }

    public void insertText(String text) {
        /* write */ strBuilder.insert(0, text);
    }

    public String getText() {
        return strBuilder.toString();
    }

    public void appendText(String text) {
        strBuilder.append(text);
    }

    public void insertMidText(String text) {
        strBuilder.insert(strBuilder.length() / 2, text);
    }
}