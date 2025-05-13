import org.jfree.chart.plot.ValueMarker;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize ValueMarker and set its value
        ValueMarker marker = new ValueMarker(0.0);
        /* write */ marker.setValue(42.0);

        // Additional code using ArrayList
        ArrayList<Double> values = new ArrayList<>();
        values.add(marker.getValue());
        values.add(100.0);
        values.add(200.0);

        // Perform some operations on the list
        double sum = 0;
        for (double val : values) {
            sum += val;
        }
        System.out.println("Sum of values: " + sum);

        // More operations
        double average = sum / values.size();
        System.out.println("Average of values: " + average);

        // Read the value from ValueMarker
        /* read */ double value = marker.getValue();
        System.out.println("Value from ValueMarker: " + value);

        // Further manipulation of the list
        values.remove(1);
        values.add(300.0);

        // Print updated list
        System.out.println("Updated values list:");
        for (double val : values) {
            System.out.println(val);
        }
    }
}