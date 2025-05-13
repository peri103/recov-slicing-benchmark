import org.apache.commons.lang3.text.StrBuilder;

public class TextManipulator {
    private StrBuilder strBuilder;

    public TextManipulator(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void modifyText(int index, char newChar) {
        /* write */ strBuilder.setCharAt(index, newChar);
    }

    public String getText() {
        return strBuilder.toString();
    }
}
