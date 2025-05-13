import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderWrapper {
    private StrBuilder strBuilder;

    public StrBuilderWrapper(String initialString) {
        this.strBuilder = new StrBuilder(initialString);
    }

    public void modifyString() {
        strBuilder.append("!");
        strBuilder.insert(0, "Greeting: ");
        /* write */ strBuilder.deleteCharAt(5); // Deletes the space between "Greeting:" and "Hello"
    }

    public String getString() {
        /* read */ return strBuilder.toString();
    }
}
