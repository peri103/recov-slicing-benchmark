import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardPieSectionLabelGenerator
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();

        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Use the write method to set the NumberFormat
        /* write */ labelGenerator.setNumberFormat(numberFormat);

        // Use the read method to get the NumberFormat
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();

        // Print the retrieved NumberFormat to verify
        System.out.println(retrievedFormat);
    }
}