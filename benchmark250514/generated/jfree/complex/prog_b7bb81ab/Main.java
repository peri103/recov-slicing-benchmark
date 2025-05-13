import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create an XYSeries and add some data
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 3.0);
        series.add(2.0, 4.0);
        series.add(3.0, 2.0);
        
        // Create a dataset and add the series to it
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        
        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "XY Chart Example", 
            "X-Axis", 
            "Y-Axis", 
            dataset
        );
        
        // Get the plot and customize it
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setRangeGridlinePaint(Color.BLACK);
        
        // Create a renderer
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        
        // Set the outline stroke for the series
        /* write */ renderer.setSeriesOutlineStroke(0, stroke);
        
        // Additional configuration for the renderer
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesStroke(0, new BasicStroke(1.5f));
        
        // Apply the renderer to the plot
        plot.setRenderer(renderer);
        
        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Processing step: " + i);
        }
        
        // Retrieve the outline stroke for verification
        /* read */ Stroke retrievedStroke = renderer.getSeriesOutlineStroke(0);
        
        // Print the retrieved stroke
        System.out.println("Retrieved Stroke: " + retrievedStroke);
        
        // Additional unrelated code
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}