import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.ValueMarker;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IntervalMarker marker = new IntervalMarker(0.0, 1.0);
        ValueMarker valueMarker = new ValueMarker(2.0);
        ArrayList<Double> values = new ArrayList<>();

        // Add some values to the list
        for (double i = 0.0; i < 10.0; i++) {
            values.add(i);
        }

        // Manipulate the valueMarker
        valueMarker.setValue(10.0);
        double markerValue = valueMarker.getValue();
        System.out.println("ValueMarker value: " + markerValue);

        // Perform some calculations
        double sum = 0.0;
        for (double val : values) {
            sum += val;
        }
        System.out.println("Sum of values: " + sum);

        // Use the original write method
        /* write */ marker.setStartValue(5.0);

        // Perform other operations
        double average = sum / values.size();
        System.out.println("Average of values: " + average);

        // Add a new marker and manipulate it
        IntervalMarker anotherMarker = new IntervalMarker(3.0, 4.0);
        anotherMarker.setEndValue(6.0);
        System.out.println("AnotherMarker end value: " + anotherMarker.getEndValue());

        // Use the original read method
        /* read */ double startValue = marker.getStartValue();
        System.out.println("IntervalMarker start value: " + startValue);

        // Print all values in the list
        for (double val : values) {
            System.out.println("Value: " + val);
        }
    }
}