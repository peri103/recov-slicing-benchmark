import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        Axis axis = new NumberAxis();
        CategoryAxis categoryAxis = new CategoryAxis();
        ValueAxis valueAxis = new NumberAxis();

        // Set label for categoryAxis
        categoryAxis.setLabel("Category Axis Label");

        // Set range for valueAxis
        valueAxis.setRange(0.0, 100.0);

        /* write */ axis.setLabel("Sample Label");

        // Perform operations using categoryAxis
        String categoryLabel = categoryAxis.getLabel();
        System.out.println("Category Axis Label: " + categoryLabel);

        // Perform operations using valueAxis
        double lowerBound = valueAxis.getLowerBound();
        double upperBound = valueAxis.getUpperBound();
        System.out.println("Value Axis Range: " + lowerBound + " to " + upperBound);

        // Some unrelated complex calculations
        double result = Math.pow(lowerBound, 2) + Math.sqrt(upperBound);
        System.out.println("Result of complex calculation: " + result);

        /* read */ String label = axis.getLabel();
        System.out.println(label);

        // Further operations with axis
        axis.setLabel("Updated Label");
        String updatedLabel = axis.getLabel();
        System.out.println("Updated Axis Label: " + updatedLabel);
    }
}