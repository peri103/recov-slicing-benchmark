import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Create a dataset
        XYSeries series = new XYSeries("Data");
        series.add(1, 5);
        series.add(2, 9);
        series.add(3, 2);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart", 
            "X-Axis", 
            "Y-Axis", 
            dataset
        );

        // Get the plot from the chart
        XYPlot plot = (XYPlot) chart.getPlot();

        // Create a renderer and set it to the plot
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        plot.setRenderer(renderer);

        // Initialize a stroke to use for the outline
        Stroke stroke = new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

        /* write */ renderer.setSeriesOutlineStroke(0, stroke);

        // Modify the renderer
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setBaseOutlinePaint(Color.BLUE);

        // Perform some operations on the plot
        plot.setDomainAxis(new NumberAxis("New X-Axis"));
        plot.setRangeAxis(new NumberAxis("New Y-Axis"));

        // Add another series to the dataset
        XYSeries series2 = new XYSeries("Another Data");
        series2.add(1, 3);
        series2.add(2, 6);
        series2.add(3, 8);
        dataset.addSeries(series2);

        // More operations before reading
        renderer.setSeriesPaint(1, Color.GREEN);
        renderer.setSeriesOutlineStroke(1, new BasicStroke(1.0f));

        /* read */ Stroke retrievedStroke = renderer.getSeriesOutlineStroke(0);

        // Print the result to verify
        System.out.println("Retrieved stroke equals original: " + retrievedStroke.equals(stroke));
    }
}