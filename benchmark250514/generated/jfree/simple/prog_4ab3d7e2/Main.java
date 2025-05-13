import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class Main {
    public static void main(String[] args) {
        // Initialize a ValueAxis object using NumberAxis as a concrete implementation
        ValueAxis axis = new NumberAxis();

        // Create a Range object to be used in the setRange method
        Range range = new Range(0.0, 10.0);

        // Use the write method setRange to set the range on the axis
        /* write */ axis.setRange(range);

        // Use the read method getRange to retrieve the range from the axis
        /* read */ Range retrievedRange = axis.getRange();

        // Print the retrieved range to ensure it matches the set range
        System.out.println("Retrieved Range: " + retrievedRange);
    }
}