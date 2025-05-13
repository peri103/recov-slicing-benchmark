import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        // Create a NumberFormat instance to be used for setting and getting
        NumberFormat numberFormat = NumberFormat.getInstance();
        
        // Use the write method to set the number format
        /* write */ labelGenerator.setNumberFormat(numberFormat);
        
        // Use the read method to get the number format
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        
        // Print out the result to verify the operation
        System.out.println(retrievedFormat.equals(numberFormat)); // Should print true
    }
}