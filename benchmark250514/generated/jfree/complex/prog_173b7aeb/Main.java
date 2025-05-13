import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create a basic chart with a title and an empty plot
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, new XYPlot(), false);
        
        // Create a ChartPanel without a chart initially
        ChartPanel chartPanel = new ChartPanel(null);
        
        // Create some data for the chart
        XYSeries series = new XYSeries("Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.sin(i));
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        // Create a plot and renderer for the chart
        XYPlot plot = new XYPlot(dataset, null, null, new XYLineAndShapeRenderer(true, false));
        chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Set the chart to the ChartPanel
        /* write */ chartPanel.setChart(chart);
        
        // Additional operations on the chart
        Plot retrievedPlot = chart.getPlot();
        
        // Simulating some complex operations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);
        
        // Re-configure the chart with new data
        XYSeries newSeries = new XYSeries("New Data");
        for (int i = 0; i < 10; i++) {
            newSeries.add(i, Math.cos(i));
        }
        dataset.addSeries(newSeries);
        
        // Retrieve the chart from the ChartPanel
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();
        
        // Outputting the title of the retrieved chart to verify correctness
        System.out.println("Retrieved Chart Title: " + retrievedChart.getTitle().getText());
        
        // Further computations
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += i * 3.14;
        }
        System.out.println("Total of first 5 multiples of pi: " + total);
    }
}