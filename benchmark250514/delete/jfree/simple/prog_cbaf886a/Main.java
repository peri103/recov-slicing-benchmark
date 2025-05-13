import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MultiplePiePlot
        MultiplePiePlot plot = new MultiplePiePlot();

        // Create a dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 10);
        dataset.setValue("Category 2", 20);

        // Set the dataset to the plot
        /* write */ plot.setDataset(dataset);

        // Retrieve the dataset from the plot
        /* read */ Dataset retrievedDataset = plot.getDataset();

        // Print the retrieved dataset to verify
        System.out.println(retrievedDataset);
    }
}