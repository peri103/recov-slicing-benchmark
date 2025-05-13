import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.Axis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();

        // Create a CategoryAxis object to be set in the plot
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");

        // Write operation: set the domain axis of the plot
        /* write */ plot.setDomainAxis(domainAxis);

        // Read operation: retrieve the domain axis of the plot
        /* read */ Axis retrievedAxis = plot.getDomainAxis();

        // Print the retrieved axis to verify it matches what was set
        System.out.println(retrievedAxis.getLabel());
    }
}