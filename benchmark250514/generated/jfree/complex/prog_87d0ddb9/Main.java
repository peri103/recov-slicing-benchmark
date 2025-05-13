import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize XYItemRenderer
        XYItemRenderer renderer = new StandardXYItemRenderer();

        // Create a dataset
        XYSeries series1 = new XYSeries("Series1");
        series1.add(1.0, 2.0);
        series1.add(2.0, 3.0);
        series1.add(3.0, 2.5);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);

        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart",
            "X-Axis",
            "Y-Axis",
            dataset
        );

        // Set renderer to the plot
        XYPlot plot = chart.getXYPlot();
        plot.setRenderer(renderer);

        // Set series paint
        /* write */ renderer.setSeriesPaint(0, Color.RED);

        // Perform some unrelated operations
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries series = dataset.getSeries(i);
            for (int j = 0; j < series.getItemCount(); j++) {
                System.out.println("X: " + series.getX(j) + ", Y: " + series.getY(j));
            }
        }

        // Retrieve series paint
        /* read */ Paint paint = renderer.getSeriesPaint(0);
        System.out.println("Series 0 Paint: " + paint);

        // Add more series and manipulate dataset
        XYSeries series2 = new XYSeries("Series2");
        series2.add(1.5, 2.5);
        series2.add(2.5, 3.5);
        series2.add(3.5, 2.0);
        dataset.addSeries(series2);

        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries series = dataset.getSeries(i);
            for (int j = 0; j < series.getItemCount(); j++) {
                System.out.println("Series " + i + " - X: " + series.getX(j) + ", Y: " + series.getY(j));
            }
        }
    }
}