import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();

        // Create a ValueAxis object to set as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        // Write operation: set the range axis
        /* write */ plot.setRangeAxis(rangeAxis);

        // Read operation: get the range axis
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();

        // Print the result to verify that the read value matches the written value
        System.out.println(retrievedAxis.getLabel());
    }
}