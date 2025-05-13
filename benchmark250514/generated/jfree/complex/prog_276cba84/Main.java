import org.jfree.chart.ChartPanel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the write method to set mouse wheel enabled
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Additional unrelated code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Perform operations on the ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More operations with ArrayList
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");

        String concatenatedString = "";
        for (String str : strings) {
            concatenatedString += str + " ";
        }
        System.out.println("Concatenated String: " + concatenatedString.trim());

        // Use the read method to check if mouse wheel is enabled
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();

        // Print the result to confirm the read method retrieves the correct value
        System.out.println("Mouse Wheel Enabled: " + isEnabled);

        // Further operations on ArrayList
        ArrayList<Double> doubles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            doubles.add(i * 1.5);
        }
        double product = 1;
        for (double d : doubles) {
            product *= d;
        }
        System.out.println("Product of doubles: " + product);
    }
}