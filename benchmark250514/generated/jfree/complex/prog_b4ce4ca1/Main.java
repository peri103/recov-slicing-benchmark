import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        Range rangeToSet = new Range(0.0, 10.0);

        /* write */ axis.setRange(rangeToSet);

        // Additional unrelated operations
        ArrayList<Double> values = new ArrayList<>();
        for (double i = 0.0; i <= 10.0; i += 0.5) {
            values.add(i);
        }

        double sum = 0.0;
        for (Double value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // Additional operations using similar API pairs
        ValueAxis axis2 = new NumberAxis();
        Range rangeToSet2 = new Range(-5.0, 5.0);
        axis2.setRange(rangeToSet2);

        Range rangeRead2 = axis2.getRange();
        System.out.println("Range of axis2: " + rangeRead2);

        // Some more complex operations
        ArrayList<Range> rangeList = new ArrayList<>();
        rangeList.add(rangeToSet);
        rangeList.add(rangeToSet2);

        for (Range range : rangeList) {
            System.out.println("Range in list: " + range);
        }

        // Read the range set earlier
        /* read */ Range rangeRead = axis.getRange();
        System.out.println("Range of axis: " + rangeRead);
    }
}