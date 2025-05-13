import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class ChartDomain {
    private CategoryPlot plot;
    
    public ChartDomain() {
        this.plot = new CategoryPlot();
    }
    
    public void setDomainAxis(CategoryAxis axis) {
        /* write */ plot.setDomainAxis(axis);
    }
    
    public CategoryAxis getDomainAxis() {
        return plot.getDomainAxis();
    }
}
