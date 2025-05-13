import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.CategoryAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize NumberAxis and TickUnit
        NumberAxis numberAxis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0);

        // Another axis for demonstration
        ValueAxis valueAxis = new NumberAxis();
        valueAxis.setLowerBound(0.0);
        valueAxis.setUpperBound(100.0);

        // Initialize a CategoryAxis
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setCategoryMargin(0.05);

        // List to store axis
        ArrayList<ValueAxis> axisList = new ArrayList<>();
        axisList.add(numberAxis);
        axisList.add(valueAxis);

        // Set tick unit for numberAxis
        /* write */ numberAxis.setTickUnit(tickUnit);

        // Perform some operations on categoryAxis
        categoryAxis.setCategoryLabelPositionOffset(10);
        categoryAxis.setCategoryMargin(0.1);

        // More operations on valueAxis
        valueAxis.setUpperMargin(0.2);
        valueAxis.setLowerMargin(0.1);

        // Retrieve and print the tick unit from numberAxis
        /* read */ TickUnit retrievedTickUnit = numberAxis.getTickUnit();
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());

        // Iterate over axisList and print bounds
        for (ValueAxis axis : axisList) {
            System.out.println("Lower Bound: " + axis.getLowerBound());
            System.out.println("Upper Bound: " + axis.getUpperBound());
        }

        // Additional operations on categoryAxis
        categoryAxis.setCategoryLabelPositions(CategoryAxis.DEFAULT_CATEGORY_LABEL_POSITIONS);
        System.out.println("Category Margin: " + categoryAxis.getCategoryMargin());
    }
}