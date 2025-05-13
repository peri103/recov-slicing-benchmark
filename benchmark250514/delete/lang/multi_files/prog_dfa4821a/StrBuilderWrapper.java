import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderWrapper {
    private StrBuilder strBuilder = new StrBuilder();

    public void appendSeparatorAndText(String separator, String text) {
        /* write */ strBuilder.appendSeparator(separator).append(text);
    }

    public String getContent() {
        return strBuilder.toString();
    }
}
