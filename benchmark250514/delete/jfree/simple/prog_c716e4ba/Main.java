import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Example Axis");
        String subCategory = "SubCategory1";
        Paint paint = Color.RED;
        
        /* write */ axis.setSubCategoryPaint(subCategory, paint);
        
        /* read */ Paint retrievedPaint = axis.getSubCategoryPaint(subCategory);
        
        System.out.println("Paint for " + subCategory + ": " + retrievedPaint);
    }
}