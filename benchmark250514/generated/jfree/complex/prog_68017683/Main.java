import org.jfree.chart.LegendItem;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Create a simple chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Column1");
        dataset.addValue(4.0, "Row1", "Column2");
        dataset.addValue(3.0, "Row1", "Column3");

        JFreeChart chart = ChartFactory.createBarChart(
                "Sample Chart",
                "Category",
                "Value",
                dataset
        );

        // Create a LegendItem and manipulate it
        LegendItem legendItem = new LegendItem("Sample Legend");
        /* write */ legendItem.setLineVisible(true);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setDataset(dataset);

        // Further unrelated operations
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Check the visibility of the line in the legend
        /* read */ boolean isVisible = legendItem.isLineVisible();
        System.out.println("Is line visible in legend: " + isVisible);

        // More unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}