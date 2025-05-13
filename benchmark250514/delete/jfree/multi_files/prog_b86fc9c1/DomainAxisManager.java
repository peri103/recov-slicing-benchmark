import org.jfree.chart.axis.CategoryAxis;

public class DomainAxisManager {
    private CategoryAxis domainAxis;

    public void setDomainAxis(CategoryAxis axis) {
        /* write */ this.domainAxis = axis;
    }

    public CategoryAxis getDomainAxis() {
        return domainAxis;
    }
}
