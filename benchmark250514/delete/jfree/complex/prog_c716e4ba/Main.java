import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Example Axis");
        String subCategory = "SubCategory1";
        Paint paint = Color.RED;
        
        // Additional code to make the program more complex
        HashMap<String, Paint> paintMap = new HashMap<>();
        paintMap.put(subCategory, Color.BLUE);
        paintMap.put("SubCategory2", Color.GREEN);
        
        // Modify the paint map
        for (String key : paintMap.keySet()) {
            Paint currentPaint = paintMap.get(key);
            if (currentPaint.equals(Color.BLUE)) {
                paintMap.put(key, Color.YELLOW);
            }
        }
        
        // Additional logic involving SubCategoryAxis
        SubCategoryAxis anotherAxis = new SubCategoryAxis("Another Axis");
        anotherAxis.setSubCategoryPaint("SubCategory2", Color.CYAN);
        Paint anotherPaint = anotherAxis.getSubCategoryPaint("SubCategory2");
        System.out.println("Another Axis Paint for SubCategory2: " + anotherPaint);
        
        /* write */ axis.setSubCategoryPaint(subCategory, paint);
        
        // Further logic before reading the value
        for (String key : paintMap.keySet()) {
            System.out.println("Paint for " + key + ": " + paintMap.get(key));
        }
        
        /* read */ Paint retrievedPaint = axis.getSubCategoryPaint(subCategory);
        
        System.out.println("Paint for " + subCategory + ": " + retrievedPaint);
        
        // Additional operations to increase complexity
        for (int i = 0; i < 3; i++) {
            SubCategoryAxis tempAxis = new SubCategoryAxis("Temp Axis " + i);
            tempAxis.setSubCategoryPaint("SubCategory" + i, Color.ORANGE);
            Paint tempPaint = tempAxis.getSubCategoryPaint("SubCategory" + i);
            System.out.println("Temp Axis Paint for SubCategory" + i + ": " + tempPaint);
        }
    }
}