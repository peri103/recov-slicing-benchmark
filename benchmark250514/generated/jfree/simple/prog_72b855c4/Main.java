import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

public class Main {
    public static void main(String[] args) {
        CategoryAxis axis = new CategoryAxis();
        
        /* write */
        axis.setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
        
        /* read */
        CategoryLabelPositions positions = axis.getCategoryLabelPositions();
        
        System.out.println(positions);
    }
}