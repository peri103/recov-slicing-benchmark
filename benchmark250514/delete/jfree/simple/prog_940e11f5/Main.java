import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator object
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();

        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Write: Set the NumberFormat instance
        /* write */ labelGenerator.setNumberFormat(numberFormat);

        // Read: Retrieve the NumberFormat instance
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();

        // Print the retrieved NumberFormat to verify
        System.out.println(retrievedFormat);
    }
}