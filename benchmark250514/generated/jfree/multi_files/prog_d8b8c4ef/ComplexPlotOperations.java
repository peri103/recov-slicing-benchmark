import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;

public class ComplexPlotOperations {
    private CategoryPlot categoryPlot;
    private XYPlot xyPlot;

    public ComplexPlotOperations() {
        categoryPlot = new CategoryPlot();
        xyPlot = new XYPlot();
    }

    public void toggleGridlines() {
        categoryPlot.setDomainGridlinesVisible(false);
        xyPlot.setDomainGridlinesVisible(true);
    }

    public boolean areCategoryGridlinesVisible() {
        return categoryPlot.isDomainGridlinesVisible();
    }

    public boolean areXYGridlinesVisible() {
        return xyPlot.isDomainGridlinesVisible();
    }
}
