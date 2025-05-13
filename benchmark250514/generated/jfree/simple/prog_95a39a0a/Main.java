import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CategoryAxis
        CategoryAxis categoryAxis = new CategoryAxis();

        // Create a CategoryLabelPositions object to set
        CategoryLabelPositions positions = CategoryLabelPositions.STANDARD;

        // Write operation: Set the category label positions
        /* write */ categoryAxis.setCategoryLabelPositions(positions);

        // Read operation: Get the category label positions
        /* read */ CategoryLabelPositions retrievedPositions = categoryAxis.getCategoryLabelPositions();

        // Print the result to verify the read value matches the written value
        System.out.println(retrievedPositions.equals(positions));
    }
}