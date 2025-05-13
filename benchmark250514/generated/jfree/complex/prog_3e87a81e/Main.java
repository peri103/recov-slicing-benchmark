import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create a XYStepAreaRenderer and set a stroke
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        BasicStroke stroke = new BasicStroke(2.0f);
        /* write */ stepAreaRenderer.setSeriesStroke(0, stroke);

        // Create another renderer and set different properties
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        BasicStroke lineStroke = new BasicStroke(1.0f);
        lineRenderer.setSeriesStroke(0, lineStroke);
        lineRenderer.setSeriesPaint(0, Color.RED);

        // Create XYSeries and add data
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);

        // Create a dataset and add the series
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Create a plot and chart using the dataset and renderers
        XYPlot plot = new XYPlot(dataset, null, null, stepAreaRenderer);
        plot.setRenderer(1, lineRenderer);

        JFreeChart chart = new JFreeChart(plot);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Retrieve the stroke set earlier
        /* read */ BasicStroke readStroke = (BasicStroke) stepAreaRenderer.getSeriesStroke(0);
        System.out.println("Stroke width: " + readStroke.getLineWidth());

        // More operations with the chart
        plot.setDomainGridlinePaint(Color.BLUE);
        plot.setRangeGridlinePaint(Color.GREEN);

        // Print some chart properties
        System.out.println("Chart title: " + chart.getTitle().getText());
    }
}