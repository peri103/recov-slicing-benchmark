import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryAxis
        CategoryAxis axis = new CategoryAxis();
        
        // Create a CategoryLabelPositions object to set and get
        CategoryLabelPositions labelPositions = CategoryLabelPositions.STANDARD;
        
        // Initialize another axis for additional complexity
        ValueAxis valueAxis = new NumberAxis("Value Axis");
        
        // Set some properties on the value axis
        valueAxis.setRange(0.0, 100.0);
        
        // Perform some calculations
        double minRange = valueAxis.getLowerBound();
        double maxRange = valueAxis.getUpperBound();
        double rangeDifference = maxRange - minRange;
        
        System.out.println("Range difference: " + rangeDifference);
        
        // Set category label positions for the original axis
        /* write */ axis.setCategoryLabelPositions(labelPositions);
        
        // Use the value axis to perform more operations
        valueAxis.setAutoRange(true);
        boolean isAutoRange = valueAxis.isAutoRange();
        
        System.out.println("Is auto range enabled: " + isAutoRange);
        
        // Retrieve the category label positions
        /* read */ CategoryLabelPositions retrievedLabelPositions = axis.getCategoryLabelPositions();
        
        // Print the retrieved label positions to verify it matches the set value
        System.out.println("Retrieved Label Positions: " + retrievedLabelPositions);
        
        // More operations on the value axis
        valueAxis.setAutoRangeIncludesZero(false);
        boolean includesZero = valueAxis.isAutoRangeIncludesZero();
        
        System.out.println("Auto range includes zero: " + includesZero);
    }
}