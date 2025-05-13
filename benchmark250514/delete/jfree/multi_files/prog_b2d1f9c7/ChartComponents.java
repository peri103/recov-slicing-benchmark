import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.BarRenderer;

public class ChartComponents {
    private CategoryPlot plot;
    private CategoryAxis domainAxis;
    private ValueAxis rangeAxis;
    private BarRenderer renderer;

    public ChartComponents() {
        plot = new CategoryPlot();
        domainAxis = new CategoryAxis("Domain Axis");
        rangeAxis = new NumberAxis("Range Axis");
        renderer = new BarRenderer();
        
        /* write */ plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);
    }

    public CategoryPlot getPlot() {
        return plot;
    }
}
