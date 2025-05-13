import org.jfree.chart.plot.ContourPlot;
import org.jfree.data.general.Dataset;

public class Main {
    public static void main(String[] args) {
        // Assuming Dataset is an interface and we have a concrete implementation named ExampleDataset
        Dataset exampleDataset = new ExampleDataset(); // Initialize the dataset

        ContourPlot plot = new ContourPlot();
        /* write */ plot.setDataset(exampleDataset);
        /* read */ Dataset retrievedDataset = plot.getDataset();

        // Print to verify the dataset is correctly set and retrieved
        System.out.println(retrievedDataset);
    }
}

// Example implementation of Dataset for demonstration purposes
class ExampleDataset implements Dataset {
    @Override
    public String toString() {
        return "ExampleDataset instance";
    }
}