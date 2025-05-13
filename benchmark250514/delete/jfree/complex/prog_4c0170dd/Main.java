import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import javax.swing.JFrame;

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

        // Create a pie plot and chart for visualization
        PiePlot piePlot = new PiePlot(dataset);
        JFreeChart pieChart = ChartFactory.createPieChart(
            "Sample Pie Chart", piePlot, true, true, false
        );

        // Display the pie chart in a frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(pieChart));
        frame.pack();
        frame.setVisible(true);

        // Perform some unrelated operations
        double sum = 0.0;
        for (int row = 0; row < dataset.getRowCount(); row++) {
            for (int col = 0; col < dataset.getColumnCount(); col++) {
                sum += dataset.getValue(row, col).doubleValue();
            }
        }
        System.out.println("Sum of all values in the dataset: " + sum);

        // Read the data extract order using the read method
        /* read */ TableOrder order = plot.getDataExtractOrder();

        // Print the extracted order to verify the read operation
        System.out.println("Data Extract Order: " + order);

        // Additional unrelated code to make the program more complex
        double average = sum / (dataset.getRowCount() * dataset.getColumnCount());
        System.out.println("Average value in the dataset: " + average);

        // Create another chart for demonstration
        JFreeChart barChart = ChartFactory.createBarChart(
            "Sample Bar Chart", "Category", "Value", dataset
        );

        // Display the bar chart in another frame
        JFrame barFrame = new JFrame();
        barFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        barFrame.add(new ChartPanel(barChart));
        barFrame.pack();
        barFrame.setVisible(true);
    }
}