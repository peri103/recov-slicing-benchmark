import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;

public class PlotManager {
    private CategoryPlot categoryPlot;
    private PiePlotWrapper piePlotWrapper;

    public PlotManager() {
        this.categoryPlot = new CategoryPlot();
        this.piePlotWrapper = new PiePlotWrapper();
        initializeCategoryPlot();
    }

    private void initializeCategoryPlot() {
        NumberAxis numberAxis = new NumberAxis();
        CategoryAxis categoryAxis = new CategoryAxis();
        
        categoryPlot.setRangeAxis(numberAxis);
        categoryPlot.setDomainAxis(categoryAxis);
        
        numberAxis.setRange(0.0, 100.0);
        categoryAxis.setCategoryMargin(0.1);
    }

    public void configurePlots() {
        categoryPlot.setRangeGridlinesVisible(true);
        categoryPlot.setDomainGridlinesVisible(false);
        piePlotWrapper.configurePiePlot();
    }

    public double getCategoryPlotRangeLowerBound() {
        return categoryPlot.getRangeAxis().getLowerBound();
    }

    public double getCategoryPlotRangeUpperBound() {
        return categoryPlot.getRangeAxis().getUpperBound();
    }

    public double getPiePlotLabelGap() {
        return piePlotWrapper.getLabelGap();
    }
}
