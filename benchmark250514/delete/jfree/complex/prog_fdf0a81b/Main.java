import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.util.TableOrder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Create a sample pie dataset
        PieDataset pieDataset = DatasetUtilities.createPieDatasetForRow(new String[] {"Category 1", "Category 2"}, new double[] {1.0, 2.0}, 0);

        // Initialize MultiplePiePlot with the dataset
        MultiplePiePlot multiplePiePlot = new MultiplePiePlot(pieDataset);

        // Set the data extract order using the write method
        /* write */ multiplePiePlot.setDataExtractOrder(TableOrder.BY_ROW);

        // Create a sample category dataset
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row 1", "Column 1");
        categoryDataset.addValue(2.0, "Row 1", "Column 2");
        categoryDataset.addValue(3.0, "Row 2", "Column 1");
        categoryDataset.addValue(4.0, "Row 2", "Column 2");

        // Create a pie chart
        JFreeChart pieChart = ChartFactory.createPieChart("Sample Pie Chart", pieDataset, true, true, false);

        // Create a bar chart using the category dataset
        JFreeChart barChart = ChartFactory.createBarChart("Sample Bar Chart", "Category", "Value", categoryDataset, PlotOrientation.VERTICAL, true, true, false);

        // Extract the plot from the pie chart
        PiePlot piePlot = (PiePlot) pieChart.getPlot();

        // Configure the pie plot
        piePlot.setSectionOutlinesVisible(true);
        piePlot.setExplodePercent("Category 1", 0.1);

        // Perform some unrelated operations
        double total = 0.0;
        for (int i = 0; i < categoryDataset.getColumnCount(); i++) {
            total += categoryDataset.getValue("Row 1", categoryDataset.getColumnKey(i)).doubleValue();
        }
        System.out.println("Total value for Row 1: " + total);

        // Read the data extract order using the read method
        /* read */ TableOrder order = multiplePiePlot.getDataExtractOrder();

        // Print the result to verify the read value
        System.out.println("Data Extract Order: " + order);

        // Perform additional unrelated operations
        double average = total / categoryDataset.getColumnCount();
        System.out.println("Average value for Row 1: " + average);
    }
}