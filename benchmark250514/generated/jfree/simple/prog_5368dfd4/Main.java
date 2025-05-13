import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        ValueAxis domainAxis = new NumberAxis("Domain Axis");

        /* write */ plot.setDomainAxis(domainAxis);
        /* read */ ValueAxis readAxis = plot.getDomainAxis();

        System.out.println(readAxis.getLabel()); // Output should be "Domain Axis"
    }
}