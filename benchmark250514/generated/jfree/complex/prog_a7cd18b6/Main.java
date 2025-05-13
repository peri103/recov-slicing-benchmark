import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.BasicStroke;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class Main {
    public static void main(String[] args) {
        // Create a dataset
        XYSeries series1 = new XYSeries("Series1");
        series1.add(1.0, 3.0);
        series1.add(2.0, 4.0);
        series1.add(3.0, 2.0);
        
        XYSeries series2 = new XYSeries("Series2");
        series2.add(1.0, 2.0);
        series2.add(2.0, 2.5);
        series2.add(3.0, 3.0);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);

        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "XY Chart Example",
            "X",
            "Y",
            dataset
        );

        // Get the plot
        XYPlot plot = chart.getXYPlot();

        // Create a renderer
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        // Set stroke for the renderer
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));

        /* write */ renderer.setPositivePaint(Color.RED);

        // Add the renderer to the plot
        plot.setRenderer(renderer);
        
        // Further operations on the plot
        NumberAxis domain = (NumberAxis) plot.getDomainAxis();
        domain.setRange(0.0, 4.0);
        
        NumberAxis range = (NumberAxis) plot.getRangeAxis();
        range.setRange(0.0, 5.0);

        // Simulate some complex operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Performing operation " + i);
        }

        /* read */ Color positivePaint = (Color) renderer.getPositivePaint();
        
        // Output the positive paint
        System.out.println("Positive Paint: " + positivePaint);
    }
}