import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

public class Main {
    public static void main(String[] args) {
        CategoryAxis axis = new CategoryAxis();
        
        // Create a CategoryLabelPositions object to set and get
        CategoryLabelPositions labelPositions = CategoryLabelPositions.STANDARD;
        
        /* write */ axis.setCategoryLabelPositions(labelPositions);
        
        /* read */ CategoryLabelPositions retrievedLabelPositions = axis.getCategoryLabelPositions();
        
        // Print the retrieved label positions to verify it matches the set value
        System.out.println(retrievedLabelPositions);
    }
}