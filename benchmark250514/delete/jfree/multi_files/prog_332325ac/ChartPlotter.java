import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class ChartPlotter {
    private CategoryPlot plot;
    private ValueAxis rangeAxis;

    public ChartPlotter() {
        this.plot = new CategoryPlot();
        this.rangeAxis = new NumberAxis("Range Axis");
    }

    public void configurePlot() {
        /* write */ plot.setRangeAxis(rangeAxis);
    }

    public CategoryPlot getPlot() {
        return plot;
    }
}
