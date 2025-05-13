import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator object
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();
        
        /* write */ labelGenerator.setNumberFormat(numberFormat);
        
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        
        // Verify the number format by printing it
        System.out.println(retrievedFormat == numberFormat); // Should print true
    }
}