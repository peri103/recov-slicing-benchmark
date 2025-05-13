import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();

        // Initialize a CategoryAxis object
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");

        // Write operation: set the domain axis of the plot
        /* write */ plot.setDomainAxis(domainAxis);

        // Read operation: get the domain axis from the plot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();

        // Output the retrieved domain axis
        System.out.println(retrievedAxis.getLabel());
    }
}