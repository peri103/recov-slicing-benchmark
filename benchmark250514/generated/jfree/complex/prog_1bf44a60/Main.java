import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        CategoryAxis categoryAxis = new CategoryAxis();
        CategoryLabelPositions positions = CategoryLabelPositions.STANDARD;
        
        ValueAxis valueAxis = new NumberAxis("Sample Axis");
        valueAxis.setRange(0.0, 10.0);
        
        /* write */ categoryAxis.setCategoryLabelPositions(positions);
        
        double lowerBound = valueAxis.getLowerBound();
        double upperBound = valueAxis.getUpperBound();
        
        for (double i = lowerBound; i <= upperBound; i++) {
            System.out.println("Value: " + i);
        }
        
        CategoryLabelPositions readPositions = categoryAxis.getCategoryLabelPositions();
        
        /* read */ System.out.println(readPositions.equals(positions));
        
        // Additional logic to make the program more complex
        CategoryAxis anotherCategoryAxis = new CategoryAxis("Another Axis");
        anotherCategoryAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);
        
        CategoryLabelPositions anotherReadPositions = anotherCategoryAxis.getCategoryLabelPositions();
        System.out.println("Another Axis Positions: " + anotherReadPositions);
        
        // Perform some arithmetic operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}