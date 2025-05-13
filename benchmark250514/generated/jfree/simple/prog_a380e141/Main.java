import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a CategoryAxis object to be used in the write operation
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        
        // Write operation: Set the domain axis for the plot
        /* write */ plot.setDomainAxis(domainAxis);
        
        // Read operation: Retrieve the domain axis from the plot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        // Print the label of the retrieved axis to verify the operation
        System.out.println(retrievedAxis.getLabel());
    }
}