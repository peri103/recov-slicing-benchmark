import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.Range;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        Range range = new Range(0.0, 100.0);
        
        // Unrelated complex operations
        ArrayList<Double> values = new ArrayList<>();
        for (double i = 0.0; i <= 100.0; i += 10.0) {
            values.add(i);
        }
        
        HashMap<String, Double> map = new HashMap<>();
        for (Double value : values) {
            map.put("Value " + value, value);
        }
        
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        /* write */ axis.setRange(range);
        
        // More unrelated complex operations
        ArrayList<Range> ranges = new ArrayList<>();
        ranges.add(new Range(0.0, 50.0));
        ranges.add(new Range(50.0, 100.0));
        
        for (Range r : ranges) {
            System.out.println("Range: " + r.getLowerBound() + " to " + r.getUpperBound());
        }
        
        /* read */ Range readRange = axis.getRange();
        System.out.println("Read Range: " + readRange.getLowerBound() + " to " + readRange.getUpperBound());
        
        // Further complexity
        double sum = 0.0;
        for (Double value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);
    }
}