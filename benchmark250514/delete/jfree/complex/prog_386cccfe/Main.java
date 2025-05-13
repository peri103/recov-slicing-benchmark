import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot and a Dataset
        Plot plot = new PiePlot();
        Dataset dataset = new DefaultPieDataset();
        
        // Populate the dataset
        DefaultPieDataset pieDataset = (DefaultPieDataset) dataset;
        pieDataset.setValue("Category A", 40);
        pieDataset.setValue("Category B", 30);
        pieDataset.setValue("Category C", 30);

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createPieChart(
                "Sample Pie Chart",
                pieDataset,
                true, true, false
        );

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Perform another unrelated operation
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString());

        // Set the dataset to the plot
        /* write */ plot.setDataset(dataset);

        // More unrelated operations
        double average = sum / 10.0;
        System.out.println("Average: " + average);

        // Retrieve the dataset from the plot
        /* read */ Dataset retrievedDataset = plot.getDataset();

        // Print the retrieved dataset to ensure correctness
        System.out.println("Retrieved Dataset: " + retrievedDataset);

        // More complex logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}