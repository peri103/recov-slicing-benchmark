import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.Axis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();

        // Configure the plot using PlotConfigurator
        PlotConfigurator.configurePlot(plot);

        // Initialize DomainManager with the plot
        DomainManager domainManager = new DomainManager(plot);

        // Create a CategoryAxis object to be set in the plot
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");

        // Write operation: set the domain axis of the plot
        domainManager.setDomainAxis(domainAxis);

        // Simulate some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read operation: retrieve the domain axis of the plot
        /* read */ Axis retrievedAxis = domainManager.getDomainAxis();

        // Print the retrieved axis to verify it matches what was set
        System.out.println(retrievedAxis.getLabel());
    }
}