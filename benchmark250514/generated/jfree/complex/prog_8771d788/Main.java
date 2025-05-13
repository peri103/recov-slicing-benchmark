import org.jfree.chart.plot.IntervalMarker;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntervalMarker marker = new IntervalMarker(0, 10);
        List<Double> values = new ArrayList<>();
        
        // Adding some initial values to the list
        for (double i = 0.0; i < 5.0; i++) {
            values.add(i * 2.0);
        }
        
        // Simulating complex operations
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) + 1.0);
        }
        
        /* write */ marker.setStartValue(5.0);
        
        // More operations
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        
        // Adding another IntervalMarker for demonstration
        IntervalMarker anotherMarker = new IntervalMarker(1, 5);
        anotherMarker.setStartValue(2.0);
        double anotherStartValue = anotherMarker.getStartValue();
        System.out.println("Another Start Value: " + anotherStartValue);
        
        // Further operations
        double average = sum / values.size();
        System.out.println("Average of values: " + average);
        
        /* read */ double startValue = marker.getStartValue();
        System.out.println("Start Value: " + startValue);
        
        // Final operations
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) * 2.0);
        }
        
        System.out.println("Final Values: " + values);
    }
}