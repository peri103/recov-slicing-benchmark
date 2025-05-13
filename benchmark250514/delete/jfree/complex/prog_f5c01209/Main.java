import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardXYToolTipGenerator object
        StandardXYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();
        
        // Create a NumberFormat instance for formatting numbers
        NumberFormat numberFormat = NumberFormat.getInstance();
        
        // Set the number format using the write method
        /* write */ toolTipGenerator.setNumberFormat(numberFormat);
        
        // Create a list of DecimalFormat instances for different formatting scenarios
        ArrayList<DecimalFormat> decimalFormats = new ArrayList<>();
        decimalFormats.add(new DecimalFormat("#,###.##"));
        decimalFormats.add(new DecimalFormat("0.00"));
        decimalFormats.add(new DecimalFormat("###,###"));
        
        // Apply each DecimalFormat to a new StandardXYToolTipGenerator and print the pattern
        for (DecimalFormat format : decimalFormats) {
            StandardXYToolTipGenerator tempGenerator = new StandardXYToolTipGenerator();
            tempGenerator.setNumberFormat(format);
            NumberFormat tempFormat = tempGenerator.getNumberFormat();
            System.out.println(((DecimalFormat) tempFormat).toPattern());
        }
        
        // Perform some unrelated calculations and store results in a list
        ArrayList<Integer> calculations = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            calculations.add(i * i);
        }
        
        // Print the calculations
        for (Integer result : calculations) {
            System.out.println("Calculation result: " + result);
        }
        
        // Retrieve the number format using the read method
        /* read */ NumberFormat retrievedFormat = toolTipGenerator.getNumberFormat();
        
        // Print the result to verify the read method retrieved the correct format
        System.out.println(retrievedFormat.equals(numberFormat));
        
        // Use the retrieved format to format a sample number
        double sampleNumber = 1234.567;
        String formattedNumber = retrievedFormat.format(sampleNumber);
        System.out.println("Formatted sample number: " + formattedNumber);
    }
}