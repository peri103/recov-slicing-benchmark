import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize the renderer and set the step point
        XYStepRenderer renderer = new XYStepRenderer();
        double stepPoint = 0.5;
        
        /* write */ renderer.setStepPoint(stepPoint);
        
        // Initialize a dataset and add some data points
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        
        // Create axes
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        
        // Create a plot with the dataset and renderer
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        
        // Perform some operations on the plot
        xAxis.setAutoRange(true);
        yAxis.setAutoRange(true);
        
        // Retrieve and print the step point
        /* read */ double readStepPoint = renderer.getStepPoint();
        System.out.println("Step Point: " + readStepPoint);
        
        // Add more series to the dataset
        XYSeries series2 = new XYSeries("Series2");
        series2.add(1.5, 2.2);
        series2.add(2.5, 3.5);
        series2.add(3.5, 2.8);
        
        dataset.addSeries(series2);
        
        // Print the data points for all series
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries currentSeries = dataset.getSeries(i);
            System.out.println("Series " + (i+1) + ":");
            for (int j = 0; j < currentSeries.getItemCount(); j++) {
                System.out.println("X: " + currentSeries.getX(j) + ", Y: " + currentSeries.getY(j));
            }
        }
    }
}