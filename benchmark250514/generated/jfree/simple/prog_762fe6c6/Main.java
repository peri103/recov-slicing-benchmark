import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize the dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Row1", "Column1");

        // Create an instance of MultiplePiePlot
        MultiplePiePlot plot = new MultiplePiePlot();

        // Use the write method to set the dataset
        /* write */ plot.setDataset(dataset);

        // Use the read method to get the dataset
        /* read */ DefaultCategoryDataset retrievedDataset = (DefaultCategoryDataset) plot.getDataset();

        // Verify the dataset is correctly retrieved
        System.out.println(retrievedDataset.getValue("Row1", "Column1"));
    }
}