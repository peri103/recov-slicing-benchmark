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
        
        // Initialize additional components for complexity
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        plot.setOutlinePaint(Color.BLUE);
        
        JFreeChart chart = new JFreeChart("XY Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Manipulate the renderer
        Stroke newStroke = new BasicStroke(1.0f);
        renderer.setSeriesOutlineStroke(1, newStroke);
        
        /* write */ renderer.setSeriesOutlineStroke(0, stroke);
        
        // Perform some operations on the plot
        plot.setDomainGridlinePaint(Color.RED);
        plot.setRangeGridlinePaint(Color.GREEN);
        
        // Additional manipulation
        Stroke anotherStroke = new BasicStroke(3.0f);
        renderer.setSeriesOutlineStroke(2, anotherStroke);

        // Read the stroke back
        /* read */ Stroke readStroke = renderer.getSeriesOutlineStroke(0);
        System.out.println("Read Stroke: " + readStroke);
        
        // Output some details about the chart for complexity
        System.out.println("Chart Title: " + chart.getTitle().getText());
        System.out.println("Domain Axis Label: " + plot.getDomainAxis().getLabel());
        System.out.println("Range Axis Label: " + plot.getRangeAxis().getLabel());
    }
}