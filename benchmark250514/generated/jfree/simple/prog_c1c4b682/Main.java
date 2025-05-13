import org.jfree.chart.plot.ValueMarker;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ValueMarker
        ValueMarker marker = new ValueMarker(0.0); // Initialize with a default value
        
        /* write */ marker.setValue(42.0); // Set the value to 42.0
        
        /* read */ double value = marker.getValue(); // Get the value
        
        // Print the value to verify
        System.out.println(value);
    }
}