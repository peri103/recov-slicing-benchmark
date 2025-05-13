import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;

public class AxisManager {
    private XYPlot plot;

    public AxisManager() {
        this.plot = new XYPlot();
    }

    public void setDomainAxis(NumberAxis domainAxis) {
        /* write */ plot.setDomainAxis(domainAxis);
    }

    public XYPlot getPlot() {
        return plot;
    }
}
