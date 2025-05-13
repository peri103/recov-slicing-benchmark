import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

public class Main {
    public static void main(String[] args) {
        CategoryAxis axis = new CategoryAxis();
        
        // Initialize CategoryLabelPositions with a sample value
        CategoryLabelPositions labelPositions = CategoryLabelPositions.STANDARD;
        
        /* write */ axis.setCategoryLabelPositions(labelPositions);
        
        /* read */ CategoryLabelPositions retrievedPositions = axis.getCategoryLabelPositions();
        
        // Print the retrieved positions to verify
        System.out.println(retrievedPositions);
    }
}