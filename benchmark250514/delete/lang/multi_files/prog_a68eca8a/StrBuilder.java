import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilder {
    private StrBuilder strBuilder;

    public StrBuilder() {
        strBuilder = new StrBuilder();
    }

    public void append(char c) {
        strBuilder.append(c);
    }

    public void deleteCharAt(int index) {
        strBuilder.deleteCharAt(index);
    }

    public String toString() {
        return strBuilder.toString();
    }
}