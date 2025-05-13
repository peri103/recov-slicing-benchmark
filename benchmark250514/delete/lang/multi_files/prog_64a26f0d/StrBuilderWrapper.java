import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderWrapper {
    private StrBuilder strBuilder = new StrBuilder();

    public void appendSeparatorWithInitial(String initial) {
        /* write */ strBuilder.appendSeparator(", ", initial);
    }

    public void appendString(String str) {
        strBuilder.append(str).append(", ");
    }

    public void appendFinalString(String str) {
        strBuilder.append(str);
    }

    public String getFinalString() {
        return strBuilder.toString();
    }
}
