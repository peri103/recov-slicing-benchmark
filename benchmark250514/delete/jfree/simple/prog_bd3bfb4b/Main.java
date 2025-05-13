import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.chart.util.TableOrder;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiplePiePlot with a dummy dataset
        MultiplePiePlot plot = new MultiplePiePlot(DatasetUtilities.createCategoryDataset("Category", "Value", new double[][]{{1.0}}));
        
        // Set the data extract order using the write method
        /* write */ plot.setDataExtractOrder(TableOrder.BY_ROW);
        
        // Read the data extract order using the read method
        /* read */ TableOrder order = plot.getDataExtractOrder();
        
        // Print the value to ensure it was correctly read
        System.out.println(order);
    }
}