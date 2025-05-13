import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot plot = new XYPlot();
        
        // Create a NumberAxis object to use as the domain axis
        ValueAxis domainAxis = new NumberAxis("Domain Axis");
        
        // Write operation: set the domain axis of the plot
        /* write */ plot.setDomainAxis(domainAxis);
        
        // Create a NumberAxis object to use as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Set the range axis of the plot
        plot.setRangeAxis(rangeAxis);
        
        // Create a renderer and set it to the plot
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);
        
        // Create a dataset and add some data to it
        XYSeries series = new XYSeries("Series1");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.pow(i, 2));
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        // Add the dataset to the plot
        plot.setDataset(dataset);
        
        // Create a chart using the plot
        JFreeChart chart = new JFreeChart("XY Plot Example", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Perform some operations on the chart
        chart.setBackgroundPaint(java.awt.Color.white);
        chart.setAntiAlias(true);
        
        // Read operation: get the domain axis from the plot
        /* read */ ValueAxis readAxis = plot.getDomainAxis();
        
        // Print out the label of the axis to verify the correct axis is read
        System.out.println("Domain Axis Label: " + readAxis.getLabel());
        
        // Perform additional operations
        XYSeries series2 = new XYSeries("Series2");
        for (int i = 0; i < 10; i++) {
            series2.add(i, Math.sqrt(i));
        }
        dataset.addSeries(series2);
        
        // Print data points from series2
        for (int i = 0; i < series2.getItemCount(); i++) {
            System.out.println("Series2 - X: " + series2.getX(i) + ", Y: " + series2.getY(i));
        }
    }
}