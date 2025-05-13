import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.util.TableOrder;

public class Main {
    public static void main(String[] args) {
        // Creating a sample dataset for demonstration purposes
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
            "Row", "Column", new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}}
        );

        // Initialize the MultiplePiePlot with the dataset
        MultiplePiePlot plot = new MultiplePiePlot(dataset);

        // Set the data extract order using the write method
        /* write */ plot.setDataExtractOrder(TableOrder.BY_ROW);

        // Read the data extract order using the read method
        /* read */ TableOrder order = plot.getDataExtractOrder();

        // Print the extracted order to verify the read operation
        System.out.println(order);
    }
}