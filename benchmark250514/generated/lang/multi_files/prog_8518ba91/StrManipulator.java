import org.apache.commons.lang3.text.StrBuilder;

public class StrManipulator {
    private StrBuilder strBuilder;

    public StrManipulator(String initialString) {
        this.strBuilder = new StrBuilder(initialString);
    }

    public void replaceFirstOccurrence(String searchStr, String replaceStr) {
        /* write */ strBuilder.replaceFirst(searchStr, replaceStr);
    }

    public String getResult() {
        return strBuilder.toString();
    }
}