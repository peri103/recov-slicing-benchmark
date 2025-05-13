import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator object
        StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator();

        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Set the NumberFormat using the write method
        /* write */ generator.setNumberFormat(numberFormat);

        // Retrieve the NumberFormat using the read method
        /* read */ NumberFormat retrievedFormat = generator.getNumberFormat();

        // Print the result to verify the value
        System.out.println(retrievedFormat.equals(numberFormat)); // Should print true if successful
    }
}