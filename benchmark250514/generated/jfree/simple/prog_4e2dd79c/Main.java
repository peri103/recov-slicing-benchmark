import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a ValueAxis object to set as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Use the write method to set the range axis
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // Use the read method to get the range axis
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        // Print the label of the retrieved axis to verify the operation
        System.out.println(retrievedAxis.getLabel());
    }
}