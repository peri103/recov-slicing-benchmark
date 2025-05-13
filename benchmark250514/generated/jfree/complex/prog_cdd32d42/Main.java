import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Create a CategoryPlot and set a domain axis
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("Sample Axis");
        
        /* write */ plot.setDomainAxis(axis);
        
        // Create a dataset for the chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Row1", "Column1");
        dataset.addValue(2, "Row1", "Column2");
        
        // Create a JFreeChart and associate the dataset with the plot
        JFreeChart chart = ChartFactory.createBarChart(
            "Sample Chart", "Category", "Value", dataset);
        
        // Set the range axis for the plot
        ValueAxis rangeAxis = new NumberAxis("Value Axis");
        plot.setRangeAxis(rangeAxis);
        
        // Perform some operations on the dataset
        for (int i = 0; i < dataset.getRowCount(); i++) {
            for (int j = 0; j < dataset.getColumnCount(); j++) {
                Number value = dataset.getValue(i, j);
                System.out.println("Value at (" + i + ", " + j + "): " + value);
            }
        }
        
        // Retrieve and print the domain axis label
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        System.out.println("Domain Axis Label: " + retrievedAxis.getLabel());
        
        // Additional operations on the chart
        chart.setTitle("Updated Chart Title");
        System.out.println("Chart Title: " + chart.getTitle().getText());
        
        // Modify the range axis and print its label
        rangeAxis.setLabel("Updated Value Axis");
        System.out.println("Range Axis Label: " + rangeAxis.getLabel());
    }
}