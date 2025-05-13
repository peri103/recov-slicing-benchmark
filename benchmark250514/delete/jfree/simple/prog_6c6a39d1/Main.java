import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Demo Axis");
        Paint paint = Color.RED;
        
        /* write */ axis.setSubCategoryPaint("SubCategory1", paint);
        
        /* read */ Paint retrievedPaint = axis.getSubCategoryPaint("SubCategory1");
        
        System.out.println(retrievedPaint);
    }
}