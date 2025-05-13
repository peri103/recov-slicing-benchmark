import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Axis axis = new NumberAxis();
        Axis categoryAxis = new CategoryAxis();
        ArrayList<String> labels = new ArrayList<>();

        /* write */ axis.setLabel("Sample Label");
        
        // Additional code to manipulate categoryAxis
        categoryAxis.setLabel("Category Axis Label");
        labels.add(categoryAxis.getLabel());

        // Adding more complexity with a loop
        for (int i = 0; i < 5; i++) {
            labels.add("Label " + i);
        }

        // Manipulating the labels list
        for (String label : labels) {
            System.out.println("Processing: " + label);
        }

        // More operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Accessing the label from axis
        /* read */ String label = axis.getLabel();
        System.out.println(label);

        // Further operations
        for (int i = 0; i < labels.size(); i++) {
            System.out.println("Label at " + i + ": " + labels.get(i));
        }
    }
}