import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

public class Main {
    public static void main(String[] args) {
        CategoryAxis categoryAxis = new CategoryAxis();
        CategoryLabelPositions positions = CategoryLabelPositions.STANDARD;
        
        /* write */ categoryAxis.setCategoryLabelPositions(positions);
        
        /* read */ CategoryLabelPositions readPositions = categoryAxis.getCategoryLabelPositions();
        
        System.out.println(readPositions.equals(positions));
    }
}