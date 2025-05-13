import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ChartPanel
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the write method to set mouse wheel enabled to true
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Create a simple XY plot with dummy data
        XYSeries series = new XYSeries("Series1");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 10);
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        XYItemRenderer renderer = new XYItemRenderer() {
            @Override
            public void drawItem(java.awt.Graphics2D graphics2D, 
                                 XYItemRendererState xyItemRendererState, 
                                 java.awt.geom.Rectangle2D rectangle2D, 
                                 org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo, 
                                 org.jfree.data.xy.XYDataset xyDataset, 
                                 int series, 
                                 int item, 
                                 org.jfree.chart.plot.PlotOrientation plotOrientation) {
                // Custom drawing logic
            }
        };
        
        Plot plot = new XYPlot(dataset, null, null, renderer);
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Set the chart to the chart panel
        chartPanel.setChart(chart);

        // Perform some operations on the chart
        chart.setBackgroundPaint(Color.white);
        plot.setBackgroundPaint(Color.lightGray);

        // Use the read method to check if mouse wheel is enabled
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();

        // Print the result
        System.out.println("Mouse wheel enabled: " + isEnabled);

        // Additional operations to make the program complex
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries currentSeries = dataset.getSeries(i);
            for (int j = 0; j < currentSeries.getItemCount(); j++) {
                System.out.println("Item " + j + ": " + currentSeries.getY(j));
            }
        }
    }
}