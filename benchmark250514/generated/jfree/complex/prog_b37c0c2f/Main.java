import org.jfree.chart.plot.ValueMarker;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ValueMarker marker = new ValueMarker(0.0);
        /* write */ marker.setValue(5.0);

        // Create a list of markers
        ArrayList<ValueMarker> markerList = new ArrayList<>();
        markerList.add(marker);
        markerList.add(new ValueMarker(10.0));
        markerList.add(new ValueMarker(20.0));

        // Perform operations on the list
        for (ValueMarker m : markerList) {
            System.out.println("Marker value: " + m.getValue());
        }

        // Modify the second marker's value
        ValueMarker secondMarker = markerList.get(1);
        secondMarker.setValue(15.0);

        // Calculate the sum of all marker values
        double sum = 0.0;
        for (ValueMarker m : markerList) {
            sum += m.getValue();
        }
        System.out.println("Sum of marker values: " + sum);

        // Access the original marker value
        /* read */ double value = marker.getValue();
        System.out.println("Original marker value: " + value);

        // Additional logic with a new marker
        ValueMarker newMarker = new ValueMarker(30.0);
        newMarker.setValue(35.0);
        System.out.println("New marker value: " + newMarker.getValue());

        // Print all marker values again
        for (ValueMarker m : markerList) {
            System.out.println("Updated marker value: " + m.getValue());
        }
    }
}