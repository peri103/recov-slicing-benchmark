import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create a simple dataset
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 1.0);
        series.add(2.0, 4.0);
        series.add(3.0, 3.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a chart
        JFreeChart chart = new JFreeChart(new XYPlot());

        // Add some customization to the plot
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setDataset(dataset);
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        plot.setRenderer(renderer);

        // Create a ChartPanel
        ChartPanel panel = new ChartPanel(chart);

        // Enable mouse wheel zooming
        /* write */ panel.setMouseWheelEnabled(true);

        // More complex operations
        panel.setDomainZoomable(true);
        panel.setRangeZoomable(true);

        // Some arbitrary logic to simulate complexity
        for (int i = 0; i < 10; i++) {
            series.add(i + 4, Math.random() * 10);
        }

        // Additional customization
        plot.setDomainGridlinePaint(Color.BLUE);
        plot.setRangeGridlinePaint(Color.GREEN);

        // Check if mouse wheel is enabled
        boolean isDomainZoomable = panel.isDomainZoomable();
        System.out.println("Domain Zoomable: " + isDomainZoomable);

        // More operations
        plot.setBackgroundPaint(Color.LIGHT_GRAY);

        // Finally, check if mouse wheel is enabled
        /* read */ boolean isMouseWheelEnabled = panel.isMouseWheelEnabled();
        System.out.println("Mouse Wheel Enabled: " + isMouseWheelEnabled);
    }
}