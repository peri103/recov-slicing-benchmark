import org.apache.commons.lang3.text.StrBuilder;

public class TextManipulator {
    private StrBuilder strBuilder;

    public TextManipulator(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void modifyText() {
        // Perform the write operation
        /* write */ strBuilder.setCharAt(6, 'W');
    }

    public String getText() {
        // Perform the read operation
        /* read */ return strBuilder.toString();
    }

    public void appendText(String text) {
        strBuilder.append(text);
    }

    public void insertText(int index, String text) {
        strBuilder.insert(index, text);
    }

    public void replaceText(int start, int end, String replacement) {
        strBuilder.replace(start, end, replacement);
    }

    public int getLength() {
        return strBuilder.length();
    }

    public int getCapacity() {
        return strBuilder.capacity();
    }
}
