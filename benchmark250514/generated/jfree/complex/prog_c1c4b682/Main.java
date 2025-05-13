import org.jfree.chart.plot.ValueMarker;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ValueMarker
        ValueMarker marker = new ValueMarker(0.0); // Initialize with a default value
        
        /* write */ marker.setValue(42.0); // Set the value to 42.0
        
        // Create additional ValueMarker instances
        ValueMarker marker2 = new ValueMarker(10.0);
        ValueMarker marker3 = new ValueMarker(20.0);
        
        // Perform some mathematical operations
        double sum = marker2.getValue() + marker3.getValue();
        double average = sum / 2;
        
        // Use an ArrayList to store values
        ArrayList<Double> values = new ArrayList<>();
        values.add(marker2.getValue());
        values.add(marker3.getValue());
        values.add(sum);
        values.add(average);
        
        // Iterate over the list and perform operations
        for (Double val : values) {
            System.out.println("Value: " + val);
        }
        
        // Perform some conditional logic
        if (average > marker.getValue()) {
            System.out.println("Average is greater than the marker value.");
        } else {
            System.out.println("Average is less than or equal to the marker value.");
        }
        
        // Further operations before reading the value
        double multipliedValue = marker.getValue() * 2;
        System.out.println("Multiplied value: " + multipliedValue);
        
        /* read */ double value = marker.getValue(); // Get the value
        
        // Print the value to verify
        System.out.println("Original marker value: " + value);
        
        // Additional operations after reading the value
        double difference = value - marker2.getValue();
        System.out.println("Difference between marker and marker2: " + difference);
        
        // Use a loop to perform operations on marker values
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) * 1.5);
        }
        
        // Print modified values
        for (Double val : values) {
            System.out.println("Modified Value: " + val);
        }
    }
}