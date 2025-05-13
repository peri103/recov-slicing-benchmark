import org.jfree.chart.ChartPanel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the write method to set mouse wheel enabled
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Additional unrelated code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // More code to increase complexity
        int maxValue = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Max value: " + maxValue);

        // Use the read method to check if mouse wheel is enabled
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();

        // Print the result
        System.out.println("Mouse wheel enabled: " + isEnabled);

        // Additional unrelated code to increase complexity
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Programming");
        words.add("Complexity");

        for (String word : words) {
            System.out.println("Word: " + word);
        }
    }
}