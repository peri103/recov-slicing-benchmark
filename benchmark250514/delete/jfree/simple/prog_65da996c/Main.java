import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StandardXYToolTipGenerator
        StandardXYToolTipGenerator generator = new StandardXYToolTipGenerator();

        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Use the write method to set the number format
        /* write */ generator.setNumberFormat(numberFormat);

        // Use the read method to get the number format
        /* read */ NumberFormat retrievedFormat = generator.getNumberFormat();

        // Print the retrieved number format to verify it matches the set format
        System.out.println(retrievedFormat.equals(numberFormat));
    }
}