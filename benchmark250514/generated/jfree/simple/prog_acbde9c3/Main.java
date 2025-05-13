import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("Domain Axis");
        
        /* write */ plot.setDomainAxis(domainAxis);
        
        /* read */ ValueAxis readAxis = plot.getDomainAxis();
        
        System.out.println("Domain Axis Label: " + readAxis.getLabel());
    }
}