import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize CategoryAxis and CategoryLabelPositions
        CategoryAxis categoryAxis = new CategoryAxis();
        CategoryLabelPositions categoryPositions = CategoryLabelPositions.STANDARD;
        
        // Initialize a ValueAxis for additional complexity
        ValueAxis valueAxis = new NumberAxis("Value Axis");
        valueAxis.setRange(0.0, 100.0);
        
        // Perform operations on the ValueAxis
        double lowerBound = valueAxis.getLowerBound();
        double upperBound = valueAxis.getUpperBound();
        System.out.println("Value Axis Range: " + lowerBound + " to " + upperBound);
        
        // Set category label positions
        /* write */ categoryAxis.setCategoryLabelPositions(categoryPositions);
        
        // Create another NumberAxis and perform some operations
        NumberAxis numberAxis = new NumberAxis("Number Axis");
        numberAxis.setAutoRangeIncludesZero(false);
        numberAxis.setRange(10.0, 50.0);
        
        // Print out the range of the NumberAxis
        System.out.println("Number Axis Range: " + numberAxis.getLowerBound() + " to " + numberAxis.getUpperBound());
        
        // Now read the category label positions
        /* read */ CategoryLabelPositions readPositions = categoryAxis.getCategoryLabelPositions();
        
        // Output the read positions
        System.out.println("Category Label Positions: " + readPositions);
        
        // Additional operations to increase complexity
        numberAxis.setTickUnit(new org.jfree.chart.axis.NumberTickUnit(5.0));
        System.out.println("Tick Unit: " + numberAxis.getTickUnit().getSize());
        
        // Perform a simple mathematical operation
        double midpoint = (lowerBound + upperBound) / 2;
        System.out.println("Midpoint of Value Axis Range: " + midpoint);
    }
}