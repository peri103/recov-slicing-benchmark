import org.jfree.chart.plot.ValueMarker;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ValueMarker object
        ValueMarker marker = new ValueMarker(0.0);

        // Create a list to store multiple markers
        ArrayList<ValueMarker> markerList = new ArrayList<>();
        markerList.add(marker);

        // Create a map to associate marker names with their values
        HashMap<String, Double> markerValues = new HashMap<>();
        markerValues.put("InitialMarker", marker.getValue());

        // Write the value using setValue method
        /* write */ marker.setValue(5.0);

        // Add a new marker to the list and map
        ValueMarker newMarker = new ValueMarker(10.0);
        markerList.add(newMarker);
        markerValues.put("NewMarker", newMarker.getValue());

        // Perform some calculations with marker values
        double sum = 0.0;
        for (ValueMarker vm : markerList) {
            sum += vm.getValue();
        }
        System.out.println("Sum of marker values: " + sum);

        // Read the value using getValue method
        /* read */ double value = marker.getValue();

        // Print the value to verify
        System.out.println("Value of original marker: " + value);

        // Print all marker values from the map
        System.out.println("Marker values from map:");
        for (String key : markerValues.keySet()) {
            System.out.println(key + ": " + markerValues.get(key));
        }

        // Update the map with a new value for the original marker
        markerValues.put("InitialMarker", value + 2.0);

        // Print updated marker values from the map
        System.out.println("Updated marker values from map:");
        for (String key : markerValues.keySet()) {
            System.out.println(key + ": " + markerValues.get(key));
        }
    }
}