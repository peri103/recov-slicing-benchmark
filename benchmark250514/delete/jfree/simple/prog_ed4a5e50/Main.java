import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.util.SortOrder;

public class Main {
    public static void main(String[] args) {
        // Initialize dataset as null since we won't be using it
        CategoryDataset dataset = null;
        
        // Create an instance of MultiplePiePlot
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        
        // Set data extract order using the write method
        /* write */ plot.setDataExtractOrder(SortOrder.ASCENDING);
        
        // Retrieve data extract order using the read method
        /* read */ SortOrder order = plot.getDataExtractOrder();
        
        // Print the value to ensure it is set correctly
        System.out.println(order);
    }
}