import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a CategoryAxis object to write into the plot
        CategoryAxis axis = new CategoryAxis3D("Sample Axis");
        
        /* write */ plot.setDomainAxis(axis);
        
        // Create an XYDataset and XYPlot for additional complexity
        XYSeries series = new XYSeries("XY Series");
        series.add(1, 5);
        series.add(2, 10);
        series.add(3, 15);
        
        XYDataset dataset = new XYSeriesCollection(series);
        
        NumberAxis xAxis = new NumberAxis("X-Axis");
        NumberAxis yAxis = new NumberAxis("Y-Axis");
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        XYPlot xyPlot = new XYPlot(dataset, xAxis, yAxis, renderer);
        
        // Perform operations on xyPlot
        xyPlot.setRenderer(new XYLineAndShapeRenderer());
        System.out.println("XYPlot Domain Axis: " + xyPlot.getDomainAxis().getLabel());
        
        // Complex calculation unrelated to the original write-read pair
        double total = 0;
        for (int i = 0; i < series.getItemCount(); i++) {
            total += series.getY(i).doubleValue();
        }
        System.out.println("Total of Y values: " + total);
        
        // Retrieve the domain axis from the plot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        // Output the result to verify the correct axis is retrieved
        System.out.println("Domain Axis Label: " + retrievedAxis.getLabel());
    }
}