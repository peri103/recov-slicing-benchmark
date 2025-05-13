import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create a renderer and set shapes visibility
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        /* write */ renderer.setShapesVisible(true);

        // Create a dataset and add some data
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create an axis for the plot
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");

        // Create a plot with the dataset and renderer
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        // Create a chart based on the plot
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        // Perform some operations on the chart
        chart.setAntiAlias(true);
        chart.setTextAntiAlias(true);

        // Check the shapes visibility
        boolean isAntiAliased = chart.getAntiAlias();
        System.out.println("Chart is anti-aliased: " + isAntiAliased);

        // More unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Value at index " + i + ": " + (i * 10));
        }

        // Finally, read the shapes visibility from the renderer
        /* read */ boolean shapesVisible = renderer.getShapesVisible();
        System.out.println("Shapes are visible: " + shapesVisible);
    }
}