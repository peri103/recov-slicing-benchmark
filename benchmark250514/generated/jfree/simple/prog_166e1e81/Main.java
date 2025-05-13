import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot
        XYPlot plot = new XYPlot();

        // Create a new NumberAxis to be used as the domain axis
        ValueAxis domainAxis = new NumberAxis("Domain Axis");

        /* write */ plot.setDomainAxis(domainAxis);

        /* read */ ValueAxis retrievedAxis = plot.getDomainAxis();

        // Print out the label of the domain axis to verify
        System.out.println(retrievedAxis.getLabel());
    }
}