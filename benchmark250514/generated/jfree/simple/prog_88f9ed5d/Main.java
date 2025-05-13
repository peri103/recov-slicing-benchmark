import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.util.TableOrder;

public class Main {
    public static void main(String[] args) {
        // Create a dummy dataset (can be null since we are not using it)
        CategoryDataset dataset = null;
        
        // Initialize MultiplePiePlot with the dataset
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        
        // Set the data extract order using the write method
        /* write */ plot.setDataExtractOrder(TableOrder.BY_ROW);
        
        // Read the data extract order using the read method
        /* read */ TableOrder order = plot.getDataExtractOrder();
        
        // Output the order to ensure it was set correctly
        System.out.println(order);
    }
}