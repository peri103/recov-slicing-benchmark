import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Axis Title");
        Color paint = Color.RED;
        
        /* write */ axis.setSubCategoryPaint("Category1", paint);
        /* read */ Paint retrievedPaint = axis.getSubCategoryPaint("Category1");
        
        System.out.println(retrievedPaint);
    }
}