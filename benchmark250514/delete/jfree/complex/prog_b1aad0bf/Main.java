import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(1.0);
        
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
        
        // Unrelated complex operations
        double[] dataPoints = {1.0, 2.0, 3.0, 4.0, 5.0};
        double total = 0.0;
        for (double point : dataPoints) {
            total += point;
        }
        double average = total / dataPoints.length;
        System.out.println("Average of data points: " + average);

        /* write */ axis.setTickUnit(tickUnit);
        
        // More operations involving axis
        axis.setRange(0.0, 10.0);
        axis.setAutoRange(true);
        
        // Unrelated complex operations
        for (double point : dataPoints) {
            if (point > average) {
                System.out.println("Point " + point + " is above average.");
            } else {
                System.out.println("Point " + point + " is below average.");
            }
        }
        
        /* read */ TickUnit readTickUnit = axis.getTickUnit();
        
        // Print the tick unit size
        System.out.println("Tick Unit: " + readTickUnit.getSize());
        
        // Further operations on categoryAxis
        categoryAxis.setCategoryMargin(0.2);
        System.out.println("Category Axis Margin: " + categoryAxis.getCategoryMargin());
    }
}