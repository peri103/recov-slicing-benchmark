import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderUtil {
    private StrBuilder strBuilder = new StrBuilder();

    public void appendWithSeparator(String separator, String value) {
        /* write */ strBuilder.appendSeparator(separator, value);
    }

    public String getContent() {
        return strBuilder.toString();
    }
}