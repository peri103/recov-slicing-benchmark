import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CombinedRangeXYPlot object
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot();

        // Initialize a ValueAxis object, which will be used to set and get the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        // Use the write method to set the range axis
        /* write */ plot.setRangeAxis(rangeAxis);

        // Use the read method to get the range axis
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();

        // Print the retrieved axis to verify it is the same as the one set
        System.out.println("Retrieved Axis: " + retrievedAxis.getLabel());
    }
}