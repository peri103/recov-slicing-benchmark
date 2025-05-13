import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderWrapper {
    private StrBuilder strBuilder;

    public StrBuilderWrapper(String initialContent) {
        strBuilder = new StrBuilder(initialContent);
    }

    public void clearContent() {
        /* write */ strBuilder.clear();
    }

    public void appendContent(String content) {
        strBuilder.append(content);
    }

    public String getContent() {
        return strBuilder.toString();
    }
}
