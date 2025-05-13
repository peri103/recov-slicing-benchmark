import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Demo Axis");
        Paint paint = Color.RED;
        Paint paint2 = Color.BLUE;
        
        // Unrelated code to make the program more complex
        Map<String, Paint> subCategoryPaints = new HashMap<>();
        subCategoryPaints.put("SubCategory1", paint);
        subCategoryPaints.put("SubCategory2", paint2);
        
        for (Map.Entry<String, Paint> entry : subCategoryPaints.entrySet()) {
            axis.setSubCategoryPaint(entry.getKey(), entry.getValue());
        }
        
        // Additional manipulation with the axis
        Paint paint3 = Color.GREEN;
        axis.setSubCategoryPaint("SubCategory3", paint3);
        
        // More complex operations
        for (String subCategory : subCategoryPaints.keySet()) {
            Paint currentPaint = axis.getSubCategoryPaint(subCategory);
            System.out.println("Paint for " + subCategory + ": " + currentPaint);
        }
        
        // Original write method
        /* write */ axis.setSubCategoryPaint("SubCategory1", paint);
        
        // Further operations
        Paint paint4 = Color.YELLOW;
        axis.setSubCategoryPaint("SubCategory4", paint4);
        
        // Manipulating more subcategories
        subCategoryPaints.put("SubCategory5", Color.BLACK);
        subCategoryPaints.put("SubCategory6", Color.WHITE);
        
        for (Map.Entry<String, Paint> entry : subCategoryPaints.entrySet()) {
            axis.setSubCategoryPaint(entry.getKey(), entry.getValue());
        }
        
        // Original read method
        /* read */ Paint retrievedPaint = axis.getSubCategoryPaint("SubCategory1");
        
        System.out.println("Retrieved Paint: " + retrievedPaint);
        
        // Final checks and print statements
        for (String subCategory : subCategoryPaints.keySet()) {
            Paint currentPaint = axis.getSubCategoryPaint(subCategory);
            System.out.println("Final Paint for " + subCategory + ": " + currentPaint);
        }
    }
}