import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderWrapper {
    private StrBuilder strBuilder;

    public StrBuilderWrapper() {
        this.strBuilder = new StrBuilder();
    }

    public void appendText(String text) {
        strBuilder.append(text);
    }

    public void truncate(int length) {
        /* write */ strBuilder.setLength(length);
    }

    public String getText() {
        return strBuilder.toString();
    }
}
