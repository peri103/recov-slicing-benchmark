import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardXYToolTipGenerator instance
        StandardXYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();

        // Create a NumberFormat instance for formatting numbers
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Use the write method to set the number format
        /* write */ toolTipGenerator.setNumberFormat(numberFormat);

        // Use the read method to get the number format
        /* read */ NumberFormat readFormat = toolTipGenerator.getNumberFormat();

        // Print the result to verify the read format is the same as the written format
        System.out.println("Number Format: " + readFormat);
    }
}