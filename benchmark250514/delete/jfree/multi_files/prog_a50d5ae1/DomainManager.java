import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.Axis;

public class DomainManager {
    private CategoryPlot plot;

    public DomainManager(CategoryPlot plot) {
        this.plot = plot;
    }

    public void setDomainAxis(CategoryAxis axis) {
        /* write */ plot.setDomainAxis(axis);
    }

    public Axis getDomainAxis() {
        return plot.getDomainAxis();
    }
}