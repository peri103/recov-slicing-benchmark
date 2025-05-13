import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize a CombinedRangeXYPlot object
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot();

        // Create a ValueAxis object to be set in the plot
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        /* write */ plot.setRangeAxis(rangeAxis);

        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();

        // Print out the label of the retrieved axis to verify
        System.out.println(retrievedAxis.getLabel());
    }
}