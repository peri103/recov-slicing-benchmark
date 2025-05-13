import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderWrapper {
    private StrBuilder strBuilder;

    public StrBuilderWrapper() {
        this.strBuilder = new StrBuilder();
    }

    public void appendText(String text) {
        strBuilder.append(text);
    }

    public String getText() {
        /* read */ return strBuilder.toString();
    }

    public void createSubstring(int start, int end) {
        /* write */ strBuilder.substring(start, end); // The substring method is used here but does not modify the original StrBuilder object
    }
}