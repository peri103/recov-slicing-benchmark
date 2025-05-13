import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        // Create an instance of XYPlot
        XYPlot plot = new XYPlot();

        // Create an instance of NumberAxis to be used as the range axis
        NumberAxis rangeAxis = new NumberAxis("Range Axis");

        // Write operation: set the range axis of the plot
        /* write */ plot.setRangeAxis(rangeAxis);

        // Read operation: get the range axis from the plot
        /* read */ NumberAxis retrievedAxis = (NumberAxis) plot.getRangeAxis();

        // Output the label of the retrieved range axis to verify the operation
        System.out.println(retrievedAxis.getLabel());
    }
}