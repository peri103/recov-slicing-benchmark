import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryTickUnit;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        CategoryAxis categoryAxis = new CategoryAxis();
        CategoryTickUnit categoryTickUnit = new CategoryTickUnit(2.0);
        
        categoryAxis.setTickUnit(categoryTickUnit);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More unrelated operations
        double[] values = {1.1, 2.2, 3.3, 4.4, 5.5};
        double average = 0.0;
        for (double value : values) {
            average += value;
        }
        average /= values.length;
        
        System.out.println("Average of values: " + average);
        
        /* write */ axis.setTickUnit(tickUnit);
        
        // Further unrelated operations
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
        
        /* read */ NumberTickUnit retrievedTickUnit = axis.getTickUnit();
        
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
        
        // Additional unrelated operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of 5: " + factorial);
        
        CategoryTickUnit retrievedCategoryTickUnit = categoryAxis.getTickUnit();
        System.out.println("Category Tick Unit: " + retrievedCategoryTickUnit.getSize());
    }
}