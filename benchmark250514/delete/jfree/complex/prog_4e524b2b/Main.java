import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.DatasetExtractOrder;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiplePiePlot and set the extract order
        MultiplePiePlot plot = new MultiplePiePlot();
        
        /* write */ plot.setDataExtractOrder(DatasetExtractOrder.BY_ROW);
        
        // Create a category dataset and add some data
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Column1");
        dataset.addValue(2.0, "Row2", "Column2");
        
        // Assign the dataset to the plot
        plot.setDataset(dataset);
        
        // Use another plot for unrelated operations
        PiePlot piePlot = new PiePlot();
        piePlot.setDataset(dataset);
        piePlot.setSectionOutlinesVisible(true);
        
        // Perform some operations on the piePlot
        piePlot.setLabelGenerator((category, value) -> category + ": " + value);
        
        // Extract the order from the original plot
        /* read */ DatasetExtractOrder order = plot.getDataExtractOrder();
        
        // Print the extract order
        System.out.println(order);
        
        // Perform additional operations on the dataset
        for (Comparable column : dataset.getColumnKeys()) {
            Number value = dataset.getValue("Row1", column);
            System.out.println("Value in Row1, " + column + ": " + value);
        }
        
        // Modify the dataset
        dataset.addValue(3.0, "Row3", "Column3");
        
        // Print dataset values
        for (Comparable row : dataset.getRowKeys()) {
            for (Comparable column : dataset.getColumnKeys()) {
                Number value = dataset.getValue(row, column);
                System.out.println("Value in " + row + ", " + column + ": " + value);
            }
        }
    }
}