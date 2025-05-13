import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;

public class DomainAxisManager {
    private CategoryPlot plot;

    public DomainAxisManager(CategoryPlot plot) {
        this.plot = plot;
    }

    public void setDomainAxis(CategoryAxis axis) {
        /* write */ plot.setDomainAxis(axis);
    }
}
