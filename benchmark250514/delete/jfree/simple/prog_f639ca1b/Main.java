import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator object
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();

        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Write operation: set the NumberFormat
        /* write */ labelGenerator.setNumberFormat(numberFormat);

        // Read operation: get the NumberFormat
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();

        // Output the result to verify that the read operation fetched the correct value
        System.out.println(retrievedFormat.equals(numberFormat)); // Should print true
    }
}