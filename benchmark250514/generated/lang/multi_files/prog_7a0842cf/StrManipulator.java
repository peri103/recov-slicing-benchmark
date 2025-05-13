import org.apache.commons.lang3.text.StrBuilder;

public class StrManipulator {
    private StrBuilder strBuilder;

    public StrManipulator(String initialString) {
        this.strBuilder = new StrBuilder(initialString);
    }

    public void modifyString() {
        // Use the substring method to modify the StrBuilder
        /* write */ strBuilder.substring(0, 5);
    }

    public String getString() {
        // Use the toString method to read the value
        /* read */ return strBuilder.toString();
    }
}