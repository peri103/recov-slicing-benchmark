import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a CategoryAxis object to use with the plot
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        
        // Use the setDomainAxis method to set the domain axis for the plot
        /* write */ plot.setDomainAxis(domainAxis);
        
        // Use the getDomainAxis method to retrieve the domain axis from the plot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        // Print out the label of the retrieved axis to verify it is the same as the one set
        System.out.println(retrievedAxis.getLabel());
    }
}