import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        // Original NumberAxis setup
        NumberAxis numberAxis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0);
        
        // Additional code to make the program more complex
        CategoryAxis categoryAxis = new CategoryAxis("Category Axis");
        ValueAxis valueAxis = new NumberAxis("Value Axis");
        valueAxis.setRange(0.0, 100.0);
        
        // Setup tick units for different axes
        TickUnit categoryTickUnit = new TickUnit(10.0);
        categoryAxis.setTickUnit(categoryTickUnit);

        // Complex calculations
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += i * 1.5;
        }
        System.out.println("Sum: " + sum);

        // Manipulating axis properties
        categoryAxis.setLabel("Updated Category Axis");
        valueAxis.setLabel("Updated Value Axis");
        
        /* write */ numberAxis.setTickUnit(tickUnit);
        
        // More complex operations
        double average = sum / 10.0;
        System.out.println("Average: " + average);
        
        // Retrieving tick unit from numberAxis
        /* read */ TickUnit retrievedTickUnit = numberAxis.getTickUnit();
        
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());

        // Final adjustments and output
        double adjustedValue = average * retrievedTickUnit.getSize();
        System.out.println("Adjusted Value: " + adjustedValue);
    }
}