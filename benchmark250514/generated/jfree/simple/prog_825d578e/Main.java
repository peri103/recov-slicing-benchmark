import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class Main {
    public static void main(String[] args) {
        // Initialize a ValueAxis object using NumberAxis as a concrete implementation
        ValueAxis axis = new NumberAxis();

        // Create a Range object to set the range
        Range rangeToSet = new Range(0.0, 100.0);

        /* write */
        axis.setRange(rangeToSet);

        /* read */
        Range range = axis.getRange();

        // Output the range to verify the read operation
        System.out.println("Range: " + range.getLowerBound() + " to " + range.getUpperBound());
    }
}