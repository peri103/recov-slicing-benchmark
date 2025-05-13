import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CombinedRangeXYPlot
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot();
        
        // Create a NumberAxis to be used as the range axis
        NumberAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Set the range axis using the setRangeAxis method
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // Retrieve the range axis using the getRangeAxis method
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        // Print the label of the retrieved axis to verify
        System.out.println(retrievedAxis.getLabel());
    }
}