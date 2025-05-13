import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a CategoryAxis object to write into the plot
        CategoryAxis axis = new CategoryAxis3D("Sample Axis");
        
        /* write */ plot.setDomainAxis(axis);
        
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        // Output the result to verify the correct axis is retrieved
        System.out.println("Domain Axis Label: " + retrievedAxis.getLabel());
    }
}