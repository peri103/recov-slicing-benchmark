import org.jfree.chart.plot.ContourPlot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultValueDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize the ContourPlot object
        ContourPlot plot = new ContourPlot();

        // Create a dataset to write to the plot
        Dataset dataset = new DefaultValueDataset(42);

        // Write the dataset to the plot
        /* write */ plot.setDataset(dataset);

        // Read the dataset from the plot
        /* read */ Dataset readDataset = plot.getDataset();

        // Print the read dataset to verify
        System.out.println(readDataset);
    }
}