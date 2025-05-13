import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot xyPlot = new XYPlot();
        
        // Create a ValueAxis object to set as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ xyPlot.setRangeAxis(rangeAxis);
        
        /* read */ ValueAxis retrievedAxis = xyPlot.getRangeAxis();
        
        // Print the label of the retrieved axis to verify the correct axis is read
        System.out.println(retrievedAxis.getLabel());
    }
}