import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Initialize a CategoryAxis object to set
        CategoryAxis axis = new CategoryAxis("Domain Axis");
        
        // Write operation: set the domain axis
        /* write */ plot.setDomainAxis(axis);
        
        // Read operation: get the domain axis
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        // Output the label of the retrieved axis to ensure the correct axis is read
        System.out.println(retrievedAxis.getLabel());
    }
}