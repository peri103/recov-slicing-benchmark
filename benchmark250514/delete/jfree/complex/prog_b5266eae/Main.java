import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.CategoryAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        
        // Additional code to make the program more complex
        CategoryAxis categoryAxis = new CategoryAxis("Categories");
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Category 1");
        categories.add("Category 2");
        categories.add("Category 3");
        
        for (String category : categories) {
            categoryAxis.addCategoryLabel(category);
        }
        
        // Simulate some complex operations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 1.5;
        }
        
        System.out.println("Sum of calculated values: " + sum);
        
        // Read the tick unit value after other operations
        /* read */ NumberTickUnit retrievedTickUnit = axis.getTickUnit();
        
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
        
        // More complex operations
        double average = sum / 10;
        System.out.println("Average: " + average);
        
        for (int i = 0; i < categories.size(); i++) {
            System.out.println("Category " + (i + 1) + ": " + categories.get(i));
        }
    }
}