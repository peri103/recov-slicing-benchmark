import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ChartInfo {
    private ChartPanel chartPanel;
    private ChartMouseSettings mouseSettings;

    public ChartInfo() {
        // Create a dummy dataset
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 5.0);
        series.add(2.0, 7.0);
        series.add(3.0, 6.0);
        XYDataset dataset = new XYSeriesCollection(series);

        // Create a dummy plot
        Plot plot = new XYPlot(dataset, null, null, null);

        // Create a dummy chart
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        // Initialize a ChartPanel object with the chart
        chartPanel = new ChartPanel(chart);
        mouseSettings = new ChartMouseSettings(chartPanel);
    }

    public void enableMouseWheel() {
        mouseSettings.enableMouseWheel();
    }

    public boolean isMouseWheelEnabled() {
        /* read */ return chartPanel.isMouseWheelEnabled();
    }
}
