import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Create an instance of XYPlot
        XYPlot plot = new XYPlot();

        // Create a domain axis to set
        ValueAxis domainAxis = new NumberAxis("Domain Axis");

        // Set the domain axis using the write method
        /* write */ plot.setDomainAxis(domainAxis);

        // Read the domain axis using the read method
        /* read */ ValueAxis retrievedDomainAxis = plot.getDomainAxis();

        // Print the retrieved domain axis
        System.out.println(retrievedDomainAxis.getLabel());
    }
}