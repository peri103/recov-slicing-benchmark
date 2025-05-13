import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.Color;

public class ChartManager {
    private JFreeChart chart;
    private ChartPanel panel;

    public ChartManager() {
        // Create a simple dataset
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 1.0);
        series.add(2.0, 4.0);
        series.add(3.0, 3.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a chart
        this.chart = new JFreeChart(new XYPlot());

        // Add some customization to the plot
        XYPlot plot = (XYPlot) this.chart.getPlot();
        plot.setDataset(dataset);
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        plot.setRenderer(renderer);

        // Create a ChartPanel
        this.panel = new ChartPanel(this.chart);

        // Enable mouse wheel zooming
        /* write */ this.panel.setMouseWheelEnabled(true);

        // More complex operations
        this.panel.setDomainZoomable(true);
        this.panel.setRangeZoomable(true);

        // Some arbitrary logic to simulate complexity
        for (int i = 0; i < 10; i++) {
            series.add(i + 4, Math.random() * 10);
        }

        // Additional customization
        plot.setDomainGridlinePaint(Color.BLUE);
        plot.setRangeGridlinePaint(Color.GREEN);
        plot.setBackgroundPaint(Color.LIGHT_GRAY);
    }

    public ChartPanel getPanel() {
        return this.panel;
    }
}