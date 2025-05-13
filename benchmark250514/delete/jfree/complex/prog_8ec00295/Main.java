import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class Main {
    public static void main(String[] args) {
        // Create a dataset for demonstration
        XYSeries series1 = new XYSeries("Series1");
        series1.add(1.0, 2.0);
        series1.add(2.0, 3.0);
        series1.add(3.0, 2.5);
        
        XYSeries series2 = new XYSeries("Series2");
        series2.add(1.0, 1.5);
        series2.add(2.0, 2.0);
        series2.add(3.0, 2.8);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        
        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart",
            "X-Axis",
            "Y-Axis",
            dataset
        );
        
        // Renderer for the chart
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        // Set the visibility of lines for a specific series
        int seriesIndex = 0; // Assuming we are working with the first series
        boolean isVisible = true;
        /* write */ renderer.setSeriesLinesVisible(seriesIndex, isVisible);
        
        // Add another unrelated configuration
        renderer.setSeriesShapesVisible(1, true);
        
        // Create a plot and set the renderer
        XYPlot plot = chart.getXYPlot();
        plot.setRenderer(renderer);
        
        // Axis configuration
        NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        domainAxis.setRange(0.0, 4.0);
        
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(0.0, 5.0);
        
        // Simulate additional operations on the renderer
        XYItemRendererState state = new XYItemRendererState(plot.getDatasetRenderingOrder());
        state.setProcessVisibleItemsOnly(true);
        
        // Retrieve the visibility of lines for the specific series
        /* read */ Boolean visibility = renderer.getSeriesLinesVisible(seriesIndex);
        
        System.out.println("Series " + seriesIndex + " lines visible: " + visibility);
        
        // Additional unrelated operations
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            System.out.println("Series " + i + " item count: " + dataset.getSeries(i).getItemCount());
        }
    }
}