import org.apache.commons.lang3.text.StrBuilder;

public class StrManipulator {
    private StrBuilder strBuilder;

    public StrManipulator(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void deleteSection(int start, int end) {
        /* write */ strBuilder.delete(start, end);
    }

    public String getText() {
        return strBuilder.toString();
    }
}
