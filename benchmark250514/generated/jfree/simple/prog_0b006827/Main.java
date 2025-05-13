import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot plot = new XYPlot();

        // Create a NumberAxis object to set as the domain axis
        NumberAxis domainAxis = new NumberAxis("X-Axis");

        // Use the write method to set the domain axis
        /* write */ plot.setDomainAxis(domainAxis);

        // Use the read method to get the domain axis
        /* read */ NumberAxis retrievedAxis = (NumberAxis) plot.getDomainAxis();

        // Print the label of the retrieved axis to verify correctness
        System.out.println(retrievedAxis.getLabel());
    }
}