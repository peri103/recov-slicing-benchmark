import org.jfree.chart.plot.ValueMarker;

public class Main {
    public static void main(String[] args) {
        // Initialize the ValueMarker object
        ValueMarker marker = new ValueMarker(0.0);
        
        // Write the value using setValue method
        /* write */ marker.setValue(5.0);
        
        // Read the value using getValue method
        /* read */ double value = marker.getValue();
        
        // Print the value to verify
        System.out.println(value);
    }
}