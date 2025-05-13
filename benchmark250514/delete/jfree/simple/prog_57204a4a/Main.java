import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Example Axis");
        Color color = Color.RED;
        
        /* write */ axis.setSubCategoryPaint("SubCategory1", color);
        /* read */ Color readColor = axis.getSubCategoryPaint("SubCategory1");
        
        System.out.println(readColor);
    }
}