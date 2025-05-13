import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StandardXYToolTipGenerator instance
        StandardXYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();

        // Create a NumberFormat instance for formatting numbers
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Use the write method to set the number format
        /* write */ toolTipGenerator.setNumberFormat(numberFormat);

        // Create additional NumberFormat objects for different purposes
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        // Use an ArrayList to store different formats
        ArrayList<NumberFormat> formats = new ArrayList<>();
        formats.add(currencyFormat);
        formats.add(percentFormat);

        // Perform some unrelated operations with a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Iterate over the map to print key-value pairs
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Perform some calculations using the formats
        for (NumberFormat fmt : formats) {
            System.out.println("Formatted number: " + fmt.format(123456.789));
        }

        // Use the read method to get the number format
        /* read */ NumberFormat readFormat = toolTipGenerator.getNumberFormat();

        // Print the result to verify the read format is the same as the written format
        System.out.println("Number Format: " + readFormat);
    }
}