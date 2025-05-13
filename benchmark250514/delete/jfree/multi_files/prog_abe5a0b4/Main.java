import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.Dataset;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a custom plot and dataset
        CustomPlot plot = new CustomPlot();
        Dataset dataset = new DefaultPieDataset();

        // Step 2: Set the dataset to the plot
        plot.setCustomDataset(dataset);

        // Step 3: Perform unrelated operations
        Visualization visualization = new Visualization();
        visualization.createPieChart();
        visualization.createCategoryChart();

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 9: " + sum);

        // Step 4: Retrieve the dataset from the plot
        /* read */ Dataset retrievedDataset = plot.getCustomDataset();

        System.out.println("Dataset set and retrieved successfully: " + (retrievedDataset == dataset));

        // Step 5: More operations unrelated to the original write-read pair
        double squareSum = 0;
        for (int i = 0; i < 5; i++) {
            squareSum += Math.pow(i, 2);
        }
        System.out.println("Sum of squares from 0 to 4: " + squareSum);
    }
}