import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        // Initialize a dataset
        Dataset dataset = new DefaultPieDataset();
        
        // Create a Plot instance (Note: Plot is abstract, typically use a subclass like PiePlot)
        Plot plot = new org.jfree.chart.plot.PiePlot(); // Using PiePlot as a concrete subclass
        
        /* write */ plot.setDataset(dataset);
        
        /* read */ Dataset readDataset = plot.getDataset();
        
        // Verify that the dataset read is the same as the one written
        System.out.println(readDataset == dataset ? "Success" : "Failure");
    }
}