import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("Domain Axis");
        
        /* write */ plot.setDomainAxis(domainAxis);
        /* read */ ValueAxis retrievedAxis = plot.getDomainAxis();
        
        System.out.println(retrievedAxis.getLabel());
    }
}