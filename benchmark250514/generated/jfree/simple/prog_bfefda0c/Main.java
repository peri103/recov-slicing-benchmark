import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();

        // Initialize the CategoryAxis object
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");

        // Write operation: Set the domain axis for the plot
        /* write */ plot.setDomainAxis(domainAxis);

        // Read operation: Get the domain axis from the plot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();

        // Output the result
        System.out.println("Retrieved Domain Axis: " + retrievedAxis.getLabel());
    }
}