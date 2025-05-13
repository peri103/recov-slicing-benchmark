import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class Main {
    public static void main(String[] args) {
        // Create an instance of NumberAxis which is a subclass of ValueAxis
        ValueAxis axis = new NumberAxis();

        // Define the range to be set
        Range rangeToSet = new Range(0.0, 100.0);

        // Write operation: Set the range on the axis
        /* write */ axis.setRange(rangeToSet);

        // Read operation: Get the range from the axis
        /* read */ Range retrievedRange = axis.getRange();

        // Print the retrieved range
        System.out.println("Retrieved Range: " + retrievedRange);
    }
}