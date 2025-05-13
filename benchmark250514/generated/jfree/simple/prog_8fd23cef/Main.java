import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Create an instance of XYPlot
        XYPlot plot = new XYPlot();

        // Create a NumberAxis instance to be used as the domain axis
        ValueAxis domainAxis = new NumberAxis("Domain Axis");

        // Use the write method to set the domain axis
        /* write */ plot.setDomainAxis(domainAxis);

        // Use the read method to get the domain axis
        /* read */ ValueAxis readDomainAxis = plot.getDomainAxis();

        // Print the domain axis to ensure it was set correctly
        System.out.println("Domain Axis Label: " + readDomainAxis.getLabel());
    }
}