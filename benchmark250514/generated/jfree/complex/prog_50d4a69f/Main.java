import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.ValueMarker;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntervalMarker marker = new IntervalMarker(0.0, 1.0);
        ValueMarker valueMarker = new ValueMarker(10.0);
        
        List<Double> values = new ArrayList<>();
        values.add(2.5);
        values.add(3.5);
        values.add(4.5);

        double sum = 0.0;
        for (double val : values) {
            sum += val;
        }
        System.out.println("Sum of values: " + sum);

        /* write */ marker.setStartValue(5.0);
        
        double average = sum / values.size();
        System.out.println("Average of values: " + average);

        valueMarker.setValue(average);
        System.out.println("ValueMarker set to average: " + valueMarker.getValue());

        double maxValue = Double.MIN_VALUE;
        for (double val : values) {
            if (val > maxValue) {
                maxValue = val;
            }
        }
        System.out.println("Max value: " + maxValue);

        /* read */ double startValue = marker.getStartValue();
        System.out.println("IntervalMarker start value: " + startValue);

        double minValue = Double.MAX_VALUE;
        for (double val : values) {
            if (val < minValue) {
                minValue = val;
            }
        }
        System.out.println("Min value: " + minValue);
    }
}