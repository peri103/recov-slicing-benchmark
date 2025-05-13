import org.jfree.chart.plot.ContourPlot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultValueDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize the ContourPlot object
        ContourPlot contourPlot = new ContourPlot();
        
        // Create a dataset
        Dataset dataset = new DefaultValueDataset(5.0);
        
        // Write the dataset to the ContourPlot
        /* write */ contourPlot.setDataset(dataset);
        
        // Read the dataset from the ContourPlot
        /* read */ Dataset readDataset = contourPlot.getDataset();
        
        // Output the result to verify
        System.out.println(readDataset);
    }
}