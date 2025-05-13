import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a CategoryAxis object to use with the plot
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        
        // Use the setDomainAxis method to set the domain axis for the plot
        /* write */ plot.setDomainAxis(domainAxis);
        
        // Create a ValueAxis object for the range axis
        ValueAxis rangeAxis = new ValueAxis("Range Axis") {};
        
        // Create an XYSeries and add some data to it
        XYSeries series = new XYSeries("Data Series");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 100);
        }
        
        // Create an XYSeriesCollection to hold the series
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        // Create an XYPlot using the dataset and axes
        XYPlot xyPlot = new XYPlot(dataset, domainAxis, rangeAxis, null);
        
        // Retrieve the domain axis from the CategoryPlot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        // Print out the label of the retrieved axis to verify it is the same as the one set
        System.out.println(retrievedAxis.getLabel());
        
        // Perform some operations on the XYPlot
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries currentSeries = dataset.getSeries(i);
            System.out.println("Series: " + currentSeries.getKey());
            for (int j = 0; j < currentSeries.getItemCount(); j++) {
                System.out.println("X: " + currentSeries.getX(j) + ", Y: " + currentSeries.getY(j));
            }
        }
        
        // Set a new range axis for the XYPlot
        ValueAxis newRangeAxis = new ValueAxis("New Range Axis") {};
        xyPlot.setRangeAxis(newRangeAxis);
        
        // Print the label of the new range axis to verify changes
        System.out.println("New Range Axis Label: " + xyPlot.getRangeAxis().getLabel());
    }
}