import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        
        // Initialize various axes
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        CategoryAxis categoryAxis = new CategoryAxis("Category Axis");
        DateAxis dateAxis = new DateAxis("Date Axis");

        // Set a category axis and a date axis
        plot.setDomainAxis(categoryAxis);
        plot.setDomainAxis(dateAxis);

        // Perform unrelated complex operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // More complex code
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Original write method
        /* write */ plot.setRangeAxis(rangeAxis);

        // Additional complex operations
        double[] values = {2.5, 3.6, 4.1, 5.2};
        double average = 0;
        for (double value : values) {
            average += value;
        }
        average /= values.length;
        System.out.println("Average value: " + average);

        // Original read method
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        System.out.println(retrievedAxis.getLabel());

        // Further complex code
        int[] numbers = {1, 2, 3, 4, 5};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
    }
}