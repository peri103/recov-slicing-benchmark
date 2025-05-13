import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderWrapper {
    private StrBuilder strBuilder;

    public StrBuilderWrapper(String initialContent) {
        this.strBuilder = new StrBuilder(initialContent);
    }

    public void clearContent() {
        /* write */ strBuilder.clear();
    }

    public String getContent() {
        return strBuilder.toString();
    }

    public void appendContent(String additionalContent) {
        strBuilder.append(additionalContent);
    }
}
