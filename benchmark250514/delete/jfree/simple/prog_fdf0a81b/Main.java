import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.util.TableOrder;

public class Main {
    public static void main(String[] args) {
        // Create a sample dataset
        PieDataset dataset = DatasetUtilities.createPieDatasetForRow(new String[] {"Category 1", "Category 2"}, new double[] {1.0, 2.0}, 0);

        // Initialize MultiplePiePlot with the dataset
        MultiplePiePlot plot = new MultiplePiePlot(dataset);

        // Set the data extract order using the write method
        /* write */ plot.setDataExtractOrder(TableOrder.BY_ROW);

        // Read the data extract order using the read method
        /* read */ TableOrder order = plot.getDataExtractOrder();

        // Print the result to verify the read value
        System.out.println(order);
    }
}