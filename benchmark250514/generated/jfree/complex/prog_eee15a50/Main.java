import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Create an instance of XYPlot
        XYPlot plot = new XYPlot();

        // Create a domain axis to set
        ValueAxis domainAxis = new NumberAxis("Domain Axis");

        // Set the domain axis using the write method
        /* write */ plot.setDomainAxis(domainAxis);

        // Create a dataset
        XYSeries series = new XYSeries("Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.sin(i));
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a renderer
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        // Set the renderer and dataset to the plot
        plot.setDataset(dataset);
        plot.setRenderer(renderer);

        // Create a chart using the plot
        JFreeChart chart = new JFreeChart("XY Plot Example", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 99: " + sum);

        // Read the domain axis using the read method
        /* read */ ValueAxis retrievedDomainAxis = plot.getDomainAxis();

        // Print the retrieved domain axis
        System.out.println(retrievedDomainAxis.getLabel());

        // Additional operations on the dataset
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries s = dataset.getSeries(i);
            for (int j = 0; j < s.getItemCount(); j++) {
                System.out.println("X: " + s.getX(j) + ", Y: " + s.getY(j));
            }
        }
    }
}