import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        Range initialRange = new Range(0.0, 10.0);
        
        /* write */ axis.setRange(initialRange);
        
        // Additional code to make the program more complex
        ArrayList<Range> rangeList = new ArrayList<>();
        rangeList.add(new Range(-5.0, 5.0));
        rangeList.add(new Range(10.0, 20.0));
        rangeList.add(new Range(20.0, 30.0));
        
        for (Range range : rangeList) {
            axis.setRange(range);
            System.out.println("Temporary Range Set: " + range.getLowerBound() + " to " + range.getUpperBound());
        }
        
        Range currentRange = new Range(5.0, 15.0);
        axis.setRange(currentRange);
        
        // Perform some calculations
        double totalRangeSpan = 0;
        for (Range range : rangeList) {
            totalRangeSpan += range.getLength();
        }
        System.out.println("Total Range Span: " + totalRangeSpan);
        
        // More unrelated code
        ArrayList<Double> values = new ArrayList<>();
        for (double i = 0.0; i < 10.0; i += 2.0) {
            values.add(i);
        }
        
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        /* read */ Range readRange = axis.getRange();
        
        System.out.println("Final Range: " + readRange.getLowerBound() + " to " + readRange.getUpperBound());
    }
}