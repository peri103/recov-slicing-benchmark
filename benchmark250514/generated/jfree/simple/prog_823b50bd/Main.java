import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Create a CategoryPlot instance
        CategoryPlot plot = new CategoryPlot();
        
        // Create a ValueAxis instance to be used as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ plot.setRangeAxis(rangeAxis);
        
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        // Output the label of the retrieved axis to verify
        System.out.println(retrievedAxis.getLabel());
    }
}