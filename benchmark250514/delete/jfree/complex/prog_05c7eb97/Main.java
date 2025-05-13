import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

public class Main {
    public static void main(String[] args) {
        // Initialize NumberAxis and set a TickUnit
        NumberAxis numberAxis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0);
        
        /* write */ numberAxis.setTickUnit(tickUnit);

        // Perform some unrelated operations
        CategoryAxis categoryAxis = new CategoryAxis("Categories");
        categoryAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        
        // Perform some operations on CategoryAxis
        categoryAxis.addCategory("Category 1");
        categoryAxis.addCategory("Category 2");
        
        // Complex operation using loops and conditions
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }

        // Read the TickUnit from NumberAxis
        /* read */ TickUnit readTickUnit = numberAxis.getTickUnit();
        
        // Output the Tick Unit size
        System.out.println("Tick Unit: " + readTickUnit.getSize());
        
        // Final calculations and output
        double average = sum / 10;
        System.out.println("Average of numbers 1 to 10: " + average);
        
        System.out.println("Category Axis Label Positions: " + categoryAxis.getCategoryLabelPositions());
    }
}