import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberTickUnit;

public class Main {
    public static void main(String[] args) {
        // Create a new CategoryPlot instance
        CategoryPlot plot = new CategoryPlot();
        
        // Create a new ValueAxis instance
        ValueAxis axis = new NumberAxis("Range Axis");
        axis.setTickUnit(new NumberTickUnit(5.0));
        
        // Create another axis for additional complexity
        ValueAxis secondaryAxis = new NumberAxis("Secondary Axis");
        secondaryAxis.setTickUnit(new NumberTickUnit(10.0));

        // Set some properties on the plot
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setDomainAxis(new CategoryAxis("Domain Axis"));

        // Write: Set the range axis of the plot
        /* write */ plot.setRangeAxis(axis);
        
        // Perform some additional operations
        plot.setRangeAxis(1, secondaryAxis); // Adding a secondary axis
        plot.getDomainAxis().setLabel("Updated Domain Axis");
        
        // Simulate some complex logic
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration: " + i);
            if (i == 1) {
                plot.setRangeAxisLocation(1, org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT);
            }
        }

        // Read: Get the range axis from the plot
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        // Print the label of the retrieved axis to verify
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());

        // Perform additional operations to increase complexity
        for (int i = 0; i < 5; i++) {
            System.out.println("Secondary Axis Tick Unit: " + secondaryAxis.getTickUnit().getSize());
        }
    }
}