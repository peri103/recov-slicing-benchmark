import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();

        // Create a CategoryAxis object to be set in the plot
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");

        // Create a ValueAxis object for the range axis
        ValueAxis rangeAxis = new ValueAxis("Range Axis") {};

        // Create a renderer for the plot
        CategoryItemRenderer renderer = new BarRenderer();

        // Set the range axis and renderer
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);

        // Set the orientation of the plot
        plot.setOrientation(PlotOrientation.HORIZONTAL);

        // Write operation: set the domain axis of the plot
        /* write */ plot.setDomainAxis(domainAxis);

        // Perform some unrelated operations
        CategoryAxis anotherAxis = new CategoryAxis("Another Axis");
        plot.setDomainAxis(1, anotherAxis);

        // Simulate some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read operation: retrieve the domain axis of the plot
        /* read */ Axis retrievedAxis = plot.getDomainAxis();

        // Print the retrieved axis to verify it matches what was set
        System.out.println(retrievedAxis.getLabel());

        // Additional complex operations
        plot.setDomainAxis(2, new CategoryAxis("Third Axis"));
        plot.setOrientation(PlotOrientation.VERTICAL);
        System.out.println("Orientation set to: " + plot.getOrientation());
    }
}