import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("SubCategory Axis");
        Paint paint = new Color(255, 0, 0); // Example color (red)
        String subCategory = "Example SubCategory";

        /* write */ axis.setSubCategoryPaint(subCategory, paint);

        // Additional complexity: Create and manipulate other axis objects
        CategoryAxis categoryAxis = new CategoryAxis("Category Axis");
        NumberAxis numberAxis = new NumberAxis("Number Axis");

        Map<String, Paint> subCategoryPaints = new HashMap<>();
        subCategoryPaints.put("SubCategory1", new Color(0, 255, 0)); // Green
        subCategoryPaints.put("SubCategory2", new Color(0, 0, 255)); // Blue

        for (Map.Entry<String, Paint> entry : subCategoryPaints.entrySet()) {
            axis.setSubCategoryPaint(entry.getKey(), entry.getValue());
        }

        Paint readPaint = null;
        for (String key : subCategoryPaints.keySet()) {
            readPaint = axis.getSubCategoryPaint(key);
            System.out.println("Paint for " + key + ": " + readPaint);
        }

        // Perform operations on the categoryAxis and numberAxis
        categoryAxis.setCategoryMargin(0.1);
        numberAxis.setAutoRangeIncludesZero(false);

        double range = numberAxis.getRange().getLength();
        System.out.println("Number Axis Range Length: " + range);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read original pair
        /* read */ Paint originalReadPaint = axis.getSubCategoryPaint(subCategory);
        System.out.println("Original Paint for " + subCategory + ": " + originalReadPaint);
    }
}