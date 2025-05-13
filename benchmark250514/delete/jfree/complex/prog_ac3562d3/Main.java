import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        ValueAxis categoryAxis = new CategoryAxis("Category Axis");
        ValueAxis logAxis = new LogarithmicAxis("Log Axis");

        /* write */ plot.setRangeAxis(rangeAxis);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 numbers: " + sum);

        XYPlot anotherPlot = new XYPlot();
        anotherPlot.setRangeAxis(categoryAxis);
        anotherPlot.setRangeAxis(logAxis);

        ValueAxis retrievedCategoryAxis = anotherPlot.getRangeAxis();
        System.out.println("Category Axis Label: " + retrievedCategoryAxis.getLabel());

        // Complex operations involving multiple objects
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Product of first 10 numbers: " + product);

        // Retrieving the range axis from the original plot
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        System.out.println(retrievedAxis.getLabel());

        // More complex calculations
        double average = (sum + product) / 2.0;
        System.out.println("Average of sum and product: " + average);
    }
}