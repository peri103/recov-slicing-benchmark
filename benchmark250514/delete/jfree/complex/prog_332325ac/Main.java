import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Additional setup for the plot
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        plot.setDomainAxis(domainAxis);
        
        // Create a dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series1", "Category1");
        dataset.addValue(5.0, "Series1", "Category2");
        dataset.addValue(3.0, "Series1", "Category3");
        
        // Create a chart
        JFreeChart chart = ChartFactory.createBarChart(
            "Sample Chart", 
            "Category", 
            "Value", 
            dataset
        );
        
        // Set the plot to the chart
        chart.setCategoryPlot(plot);
        
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // Create a frame to display the chart
        JFrame frame = new JFrame("Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);
        
        // Some unrelated operations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        System.out.println("Axis Label: " + retrievedAxis.getLabel());
        
        // Additional operations after read
        double average = sum / 10;
        System.out.println("Average: " + average);
        
        // More operations on dataset
        dataset.addValue(7.0, "Series1", "Category4");
        dataset.addValue(2.0, "Series1", "Category5");
        
        // Print dataset values
        for (int i = 1; i <= 5; i++) {
            System.out.println("Category" + i + ": " + dataset.getValue("Series1", "Category" + i));
        }
    }
}