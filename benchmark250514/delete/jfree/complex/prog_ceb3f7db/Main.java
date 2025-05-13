import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        
        // Create a series and add some data
        XYSeries series = new XYSeries("Random Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 100);
        }
        
        // Create a dataset and add the series
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        
        // Create axes
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        
        // Create a plot
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        
        // Create a chart
        JFreeChart chart = new JFreeChart("XY Step Area Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Set chart background
        chart.setBackgroundPaint(Color.white);
        
        // Set plot background
        plot.setBackgroundPaint(Color.lightGray);
        
        // Set gridlines
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        
        // Set renderer properties
        renderer.setSeriesPaint(0, Color.blue);
        
        /* write */ renderer.setOutlineStroke(stroke);
        
        // Modify other properties of the renderer
        renderer.setSeriesOutlinePaint(0, Color.red);
        renderer.setSeriesFillPaint(0, Color.green);
        
        // Perform some unrelated operations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Retrieve the outline stroke
        /* read */ Stroke readStroke = renderer.getOutlineStroke();
        
        System.out.println("Outline stroke: " + readStroke);
        
        // Further operations on the chart
        renderer.setSeriesPaint(1, Color.orange);
        renderer.setSeriesOutlinePaint(1, Color.black);
    }
}