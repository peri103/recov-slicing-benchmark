import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize the plot and axes
        XYPlot plot = new XYPlot();
        ValueAxis domainAxis = new NumberAxis("Domain Axis");
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Set the domain axis
        /* write */ plot.setDomainAxis(domainAxis);

        // Configure the renderer
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        plot.setRenderer(renderer);
        
        // Create a dataset
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 4.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        // Assign the dataset and range axis to the plot
        plot.setDataset(dataset);
        plot.setRangeAxis(rangeAxis);

        // Create a chart using the plot
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Perform some additional operations
        ValueAxis rangeAxisRead = plot.getRangeAxis();
        System.out.println("Range Axis Label: " + rangeAxisRead.getLabel());

        // Read the domain axis
        /* read */ ValueAxis readAxis = plot.getDomainAxis();
        System.out.println("Domain Axis Label: " + readAxis.getLabel()); // Output should be "Domain Axis"

        // Modify the series and update the dataset
        series.add(4.0, 5.0);
        series.add(5.0, 6.0);
        dataset.addSeries(series);

        // Print out the series data
        for (int i = 0; i < series.getItemCount(); i++) {
            System.out.println("X: " + series.getX(i) + ", Y: " + series.getY(i));
        }
    }
}