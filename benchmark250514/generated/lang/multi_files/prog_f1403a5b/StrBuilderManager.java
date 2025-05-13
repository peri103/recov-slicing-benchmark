import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderManager {
    private StrBuilder strBuilder;

    public StrBuilderManager(String initialContent) {
        this.strBuilder = new StrBuilder(initialContent);
    }

    public void modifyContent() {
        /* write */ strBuilder.deleteAll("World");
    }

    public String getContent() {
        return strBuilder.toString();
    }
}
