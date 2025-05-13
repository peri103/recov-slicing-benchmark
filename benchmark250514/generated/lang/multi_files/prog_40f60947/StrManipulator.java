import org.apache.commons.lang3.text.StrBuilder;

public class StrManipulator {
    private StrBuilder strBuilder;

    public StrManipulator(String initialText) {
        this.strBuilder = new StrBuilder(initialText);
    }

    public void replaceWorldWithJava() {
        /* write */ strBuilder.replaceAll("World", "Java");
    }

    public String getResult() {
        /* read */ return strBuilder.toString();
    }
}