import org.jfree.chart.plot.ContourPlot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultValueDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize the ContourPlot object
        ContourPlot plot = new ContourPlot();

        // Create a dataset to be used with the plot
        Dataset dataset = new DefaultValueDataset(5.0);

        // Use the write method to set the dataset
        /* write */ plot.setDataset(dataset);

        // Use the read method to retrieve the dataset
        /* read */ Dataset retrievedDataset = plot.getDataset();

        // Print the retrieved dataset to verify
        System.out.println(retrievedDataset);
    }
}