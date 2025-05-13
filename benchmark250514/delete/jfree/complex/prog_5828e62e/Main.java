import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // Create a simple dataset
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart",
            "X-Axis",
            "Y-Axis",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
        
        // Configure the plot with renderer
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        renderer.setSeriesPaint(0, Color.BLUE);
        
        // Manipulate renderer settings
        renderer.setBaseShapesVisible(true);
        renderer.setBaseShapesFilled(true);
        
        // Retrieve and print the range axis label
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        System.out.println("Range Axis: " + retrievedAxis.getLabel());
        
        // Additional chart manipulations
        chart.setBackgroundPaint(Color.WHITE);
        plot.setOutlinePaint(Color.BLACK);
        
        // Simulate some complex operations
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries currentSeries = dataset.getSeries(i);
            for (int j = 0; j < currentSeries.getItemCount(); j++) {
                double x = currentSeries.getX(j).doubleValue();
                double y = currentSeries.getY(j).doubleValue();
                System.out.println("Point: (" + x + ", " + y + ")");
            }
        }
    }
}