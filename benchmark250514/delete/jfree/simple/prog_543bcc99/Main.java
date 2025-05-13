import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a CategoryAxis object to set on the plot
        CategoryAxis domainAxis = new CategoryAxis3D("Domain Axis");
        
        // Write operation: set the domain axis of the plot
        /* write */ plot.setDomainAxis(domainAxis);
        
        // Read operation: get the domain axis from the plot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        // Output the result to verify the correctness
        System.out.println(retrievedAxis.getLabel());
    }
}