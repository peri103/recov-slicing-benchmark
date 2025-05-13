import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object with a simple XY plot
        XYSeries series = new XYSeries("Series1");
        series.add(1, 1);
        series.add(2, 4);
        series.add(3, 9);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        // Create a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the setChart method to write the chart to the panel
        /* write */ chartPanel.setChart(chart);

        // Additional unrelated code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of squares: " + sum);

        // More code to interact with the chart
        JFreeChart anotherChart = new JFreeChart("Another Chart", JFreeChart.DEFAULT_TITLE_FONT, new XYPlot(), true);
        chartPanel.setChart(anotherChart);

        Plot retrievedPlot = chart.getPlot();
        System.out.println("Plot type: " + retrievedPlot.getClass().getSimpleName());

        // Use the getChart method to read the chart from the panel
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();

        // Output to verify that the retrieved chart is the same as the one set
        System.out.println(retrievedChart == chart); // This should print "true"
    }
}