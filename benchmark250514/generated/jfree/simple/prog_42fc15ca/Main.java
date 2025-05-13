import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the necessary objects
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        // Write operation: set the range axis
        /* write */ plot.setRangeAxis(rangeAxis);

        // Read operation: get the range axis
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();

        // Output the result to verify the write and read operations
        System.out.println(retrievedAxis.getLabel());
    }
}