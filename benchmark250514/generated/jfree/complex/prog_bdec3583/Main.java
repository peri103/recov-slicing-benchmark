import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object (dummy initialization for demonstration)
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 1.0);
        series.add(2.0, 4.0);
        series.add(3.0, 3.0);

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(true, false);

        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        // Initialize a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Additional complex code
        XYSeries anotherSeries = new XYSeries("Another Data");
        anotherSeries.add(4.0, 5.0);
        anotherSeries.add(5.0, 7.0);
        anotherSeries.add(6.0, 8.0);

        XYSeriesCollection anotherDataset = new XYSeriesCollection(anotherSeries);
        plot.setDataset(1, anotherDataset);
        renderer.setSeriesPaint(0, Color.red);
        renderer.setSeriesPaint(1, Color.blue);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* write */ chartPanel.setChart(chart);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Continue with more operations
        double average = sum / 10.0;
        System.out.println("Average of first 10 numbers: " + average);

        /* read */ JFreeChart retrievedChart = chartPanel.getChart();

        // Print the result to verify
        System.out.println(retrievedChart == chart); // Should print true if the read value matches the written value
    }
}