import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot plot = new XYPlot();

        // Create a ValueAxis object to be used as the domain axis
        ValueAxis domainAxis = new NumberAxis("Domain Axis");

        // Write: Set the domain axis for the plot
        /* write */ plot.setDomainAxis(domainAxis);

        // Read: Retrieve the domain axis from the plot
        /* read */ ValueAxis retrievedAxis = plot.getDomainAxis();

        // Print the label of the retrieved axis to verify it is the same as the one set
        System.out.println(retrievedAxis.getLabel());
    }
}