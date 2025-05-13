import org.apache.commons.lang3.text.StrBuilder;

public class StrAnalyzer {
    private StrBuilder strBuilder;

    public StrAnalyzer(StrManipulator manipulator) {
        this.strBuilder = new StrBuilder(manipulator.getText());
    }

    public int countWords() {
        String text = strBuilder.toString();
        return text.split("\\s+").length;
    }

    public String analyzeText() {
        // Example analysis: convert to uppercase
        return strBuilder.toString().toUpperCase();
    }
}
