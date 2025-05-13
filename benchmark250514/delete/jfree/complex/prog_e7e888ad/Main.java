import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Example Axis");
        Paint paint = new Color(255, 0, 0); // Red color
        
        /* write */ axis.setSubCategoryPaint("SubCategory1", paint);
        
        // Create a list of subcategories
        ArrayList<String> subCategories = new ArrayList<>();
        subCategories.add("SubCategory1");
        subCategories.add("SubCategory2");
        subCategories.add("SubCategory3");
        
        // Assign random colors to each subcategory
        HashMap<String, Paint> subCategoryPaints = new HashMap<>();
        subCategoryPaints.put("SubCategory1", new Color(255, 0, 0)); // Red
        subCategoryPaints.put("SubCategory2", new Color(0, 255, 0)); // Green
        subCategoryPaints.put("SubCategory3", new Color(0, 0, 255)); // Blue

        for (String subCategory : subCategories) {
            axis.setSubCategoryPaint(subCategory, subCategoryPaints.get(subCategory));
        }
        
        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
        
        /* read */ Paint retrievedPaint = axis.getSubCategoryPaint("SubCategory1");
        
        System.out.println("Retrieved Paint for SubCategory1: " + retrievedPaint);
        
        // Iterate over subcategories and print their colors
        for (String subCategory : subCategories) {
            Paint color = axis.getSubCategoryPaint(subCategory);
            System.out.println("Color for " + subCategory + ": " + color);
        }
    }
}