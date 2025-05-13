import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create a renderer for dots
        XYDotRenderer dotRenderer = new XYDotRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        // Set some properties on the line renderer
        lineRenderer.setSeriesShapesVisible(0, true);
        lineRenderer.setSeriesLinesVisible(0, true);
        
        // Create a dataset
        XYSeries series = new XYSeries("Random Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 100);
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a plot with the dot renderer
        XYPlot plot = new XYPlot(dataset, null, null, dotRenderer);

        // Create a chart with the plot
        JFreeChart chart = new JFreeChart(plot);

        // Set dot width using dot renderer
        /* write */ dotRenderer.setDotWidth(5);

        // Add some operations that do not affect the original write-read pair
        plot.setRenderer(lineRenderer);
        lineRenderer.setSeriesShapesVisible(1, false);
        lineRenderer.setSeriesLinesVisible(1, false);

        // Retrieve dot width using dot renderer
        /* read */ int dotWidth = dotRenderer.getDotWidth();
        System.out.println("Dot Width: " + dotWidth);

        // Additional operations to make the program more complex
        for (int i = 0; i < series.getItemCount(); i++) {
            double x = series.getX(i).doubleValue();
            double y = series.getY(i).doubleValue();
            System.out.println("Point " + i + ": (" + x + ", " + y + ")");
        }

        // Modify and print series data
        series.add(10, 50.0);
        series.add(11, 75.0);
        for (int i = 0; i < series.getItemCount(); i++) {
            double x = series.getX(i).doubleValue();
            double y = series.getY(i).doubleValue();
            System.out.println("Updated Point " + i + ": (" + x + ", " + y + ")");
        }
    }
}