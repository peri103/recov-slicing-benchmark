import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot plot = new XYPlot();
        
        // Create a NumberAxis object to use as the domain axis
        ValueAxis domainAxis = new NumberAxis("Domain Axis");
        
        // Write operation: set the domain axis of the plot
        /* write */ plot.setDomainAxis(domainAxis);
        
        // Read operation: get the domain axis from the plot
        /* read */ ValueAxis readAxis = plot.getDomainAxis();
        
        // Print out the label of the axis to verify the correct axis is read
        System.out.println("Domain Axis Label: " + readAxis.getLabel());
    }
}