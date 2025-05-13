import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot and ValueAxis
        XYPlot plot = new XYPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        // Write operation
        /* write */ plot.setRangeAxis(rangeAxis);

        // Read operation
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();

        // Output the result to verify the read value
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());
    }
}