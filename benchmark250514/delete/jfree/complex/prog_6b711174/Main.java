import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize SubCategoryAxis
        SubCategoryAxis axis = new SubCategoryAxis("Axis Title");
        
        // Define a color for subcategory paint
        Color paint = Color.RED;
        
        // Initialize a map to store category paints
        Map<String, Paint> categoryPaints = new HashMap<>();
        
        // Set paint for a category
        categoryPaints.put("Category2", Color.BLUE);
        categoryPaints.put("Category3", Color.GREEN);
        
        // Apply paint to categories
        for (Map.Entry<String, Paint> entry : categoryPaints.entrySet()) {
            axis.setSubCategoryPaint(entry.getKey(), entry.getValue());
        }
        
        // Write the paint for "Category1"
        /* write */ axis.setSubCategoryPaint("Category1", paint);
        
        // Retrieve and print paints for all categories
        for (String category : categoryPaints.keySet()) {
            Paint retrievedPaint = axis.getSubCategoryPaint(category);
            System.out.println("Paint for " + category + ": " + retrievedPaint);
        }
        
        // Some unrelated calculations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Read the paint for "Category1"
        /* read */ Paint retrievedPaint = axis.getSubCategoryPaint("Category1");
        
        // Print the retrieved paint
        System.out.println("Paint for Category1: " + retrievedPaint);
        
        // Additional logic to manipulate paints
        categoryPaints.put("Category4", Color.YELLOW);
        for (String category : categoryPaints.keySet()) {
            axis.setSubCategoryPaint(category, categoryPaints.get(category));
        }
    }
}