import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ValueAxis
        ValueAxis axis = new NumberAxis();

        // Define the range to be set
        Range rangeToSet = new Range(0.0, 100.0);

        // Write operation: set the range
        /* write */ axis.setRange(rangeToSet);

        // Read operation: get the range
        /* read */ Range rangeRead = axis.getRange();

        // Output the range to verify the read value is the same as the written value
        System.out.println("Range: " + rangeRead.getLowerBound() + " to " + rangeRead.getUpperBound());
    }
}