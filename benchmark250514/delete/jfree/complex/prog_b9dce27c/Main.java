import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        Axis axis = new CategoryAxis();
        ValueAxis valueAxis = new NumberAxis();
        
        // Set a label for the axis
        /* write */ axis.setLabel("X-Axis Label");
        
        // Configure the value axis
        valueAxis.setRange(0.0, 100.0);
        valueAxis.setTickLabelsVisible(true);
        valueAxis.setLabel("Y-Axis Label");
        
        // Perform some operations on the value axis
        double lowerBound = valueAxis.getLowerBound();
        double upperBound = valueAxis.getUpperBound();
        System.out.println("Value Axis Range: " + lowerBound + " to " + upperBound);
        
        // Modify the axis label
        axis.setLabel("Modified X-Axis Label");
        
        // Retrieve the label from the axis
        /* read */ String label = axis.getLabel();
        System.out.println(label);
        
        // Additional operations with the value axis
        valueAxis.setAutoRangeIncludesZero(false);
        System.out.println("Auto Range Includes Zero: " + valueAxis.isAutoRangeIncludesZero());
        
        // Further unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Final operation on value axis
        valueAxis.setLabel("Final Y-Axis Label");
        System.out.println("Final Value Axis Label: " + valueAxis.getLabel());
    }
}