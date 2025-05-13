import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("SubCategory Axis");
        Paint paint = new Color(255, 0, 0); // Example color (red)
        String subCategory = "Example SubCategory";

        /* write */ axis.setSubCategoryPaint(subCategory, paint);
        /* read */ Paint readPaint = axis.getSubCategoryPaint(subCategory);

        System.out.println(readPaint);
    }
}