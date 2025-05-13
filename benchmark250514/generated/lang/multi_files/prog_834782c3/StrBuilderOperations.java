import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderOperations {
    private StrBuilder strBuilder;

    public StrBuilderOperations(String initialString) {
        this.strBuilder = new StrBuilder(initialString);
    }

    public void modifyString() {
        strBuilder.append(" Welcome to the universe.");
        int index = strBuilder.indexOf("universe");
        strBuilder.insert(index, "vast ");
        /* write */ strBuilder.delete(5, 11); // Deletes " World" from "Hello World!"
    }

    public String getString() {
        return strBuilder.toString();
    }
}