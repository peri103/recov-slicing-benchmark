import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;

public class PlotReader {
    private CategoryPlot plot;

    public PlotReader(CategoryPlot plot) {
        this.plot = plot;
    }

    public CategoryAxis getDomainAxis() {
        /* read */ return plot.getDomainAxis();
    }
}
