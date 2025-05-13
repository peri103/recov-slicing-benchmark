import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        // Create a new CategoryPlot instance
        CategoryPlot plot = new CategoryPlot();
        
        // Create a new ValueAxis instance
        ValueAxis axis = new NumberAxis("Range Axis");
        
        // Write: Set the range axis of the plot
        /* write */ plot.setRangeAxis(axis);
        
        // Read: Get the range axis from the plot
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        // Print the label of the retrieved axis to verify
        System.out.println(retrievedAxis.getLabel());
    }
}