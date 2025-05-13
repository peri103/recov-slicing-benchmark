import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardXYToolTipGenerator object
        StandardXYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();
        
        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Set the number format using the write method
        /* write */ toolTipGenerator.setNumberFormat(numberFormat);

        // Retrieve the number format using the read method
        /* read */ NumberFormat retrievedFormat = toolTipGenerator.getNumberFormat();

        // Print the retrieved number format to ensure it matches the set format
        System.out.println(retrievedFormat.equals(numberFormat));
    }
}