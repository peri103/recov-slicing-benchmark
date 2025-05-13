import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new StandardXYItemRenderer();
        
        // Create a simple XY chart with dummy data
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        
        NumberAxis xAxis = new NumberAxis("X-Axis");
        NumberAxis yAxis = new NumberAxis("Y-Axis");
        
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        
        JFreeChart chart = new JFreeChart("XY Chart Example", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Modify renderer properties
        renderer.setSeriesPaint(0, java.awt.Color.RED);
        renderer.setSeriesShapesVisible(0, false);
        
        /* write */ renderer.setBaseShapesVisible(true);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        // More unrelated operations
        double[] values = {1.2, 3.4, 5.6, 7.8};
        double total = 0;
        for (double value : values) {
            total += value;
        }
        System.out.println("Total sum of array values: " + total);
        
        /* read */ boolean isShapesVisible = renderer.getBaseShapesVisible();
        System.out.println("Base shapes visible: " + isShapesVisible);
        
        // Additional operations on the chart
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);
        
        // Print chart title
        System.out.println("Chart title: " + chart.getTitle().getText());
    }
}