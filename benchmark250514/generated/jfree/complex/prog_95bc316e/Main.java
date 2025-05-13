import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Assume we have a chart object to initialize ChartPanel
        JFreeChart chart = new JFreeChart(null);
        ChartPanel panel = new ChartPanel(chart);

        // Initialize some unrelated objects and perform operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of even numbers: " + sum);

        // Set mouse wheel enabled on the panel
        /* write */ panel.setMouseWheelEnabled(true);

        // Perform additional operations
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        for (String str : strings) {
            System.out.println(str);
        }

        // Check if mouse wheel is enabled
        /* read */ boolean isEnabled = panel.isMouseWheelEnabled();
        System.out.println("Is mouse wheel enabled: " + isEnabled);

        // More complex operations
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of even numbers: " + product);

        // Perform some string manipulations
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str).append(" ");
        }
        System.out.println("Concatenated String: " + sb.toString().trim());
    }
}